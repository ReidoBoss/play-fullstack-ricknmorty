package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.ws._
import play.api.cache.AsyncCacheApi
import scala.concurrent.{Future,ExecutionContext}
import domain.characters._

@Singleton
class HomeController @Inject()
(ws:WSClient,cache:AsyncCacheApi)
(val controllerComponents: ControllerComponents) 
(using ec:ExecutionContext)
extends BaseController {

  val characterUrl = "https://rickandmortyapi.com/api/character"
  
  def index() = Action.async { implicit request:Request[AnyContent] =>
     cache.getOrElseUpdate("main"){
      ws.url(characterUrl).get().flatMap{ response => 
        response.json.validate[CharWrapper].map{ x=>
          Future(Ok(views.html.index(x.results)))
        }.getOrElse{
          Future(Ok("Oh my god, WOW!"))
        }
      }
     }
  }

  def character(charId:Int) = Action.async { implicit request:Request[AnyContent] =>
     cache.getOrElseUpdate(s"$charId$characterUrl"){
      ws.url(characterUrl+"/"+charId).get().flatMap{ response => 
        response.json.validate[CharWrapper].map{ x=>
          Future(Ok(views.html.index(x.results)))
        }.getOrElse{
          Future(Ok("Oh my god, WOW!"))
        }
      }
     }
  }



}
