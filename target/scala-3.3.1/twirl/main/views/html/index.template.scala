
package views.html

import _root_.play.twirl.api.TwirlFeatureImports.*
import _root_.play.twirl.api.TwirlHelperImports.*
import scala.language.adhocExtensions
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<div>
    <h1 class="heading">Rick n' Morty Wiki</h1>  
  </div>
  <div class="body">
    <h1>Home</h1>
      <h2>Welcome to <span class="creepster">Rick n Morty</span> Wiki!</h2>
      <img class="center" src="https://i.ytimg.com/vi/k0TWLSQVBpM/maxresdefault.jpg">
    <h2>Main Characters</h2>
    <!-- <div class="main-characters-container">
      
    </div> -->
  </div>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 7051ac462e9f6de4610f628f839243bbeaffa3ac
                  MATRIX: 760->1|856->4|883->6|914->29|953->31|982->34|1388->410
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4|41->16
                  -- GENERATED --
              */
          