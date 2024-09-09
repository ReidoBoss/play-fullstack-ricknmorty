
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[domain.characters.Result],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(res:List[domain.characters.Result]):play.twirl.api.HtmlFormat.Appendable = {
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
    <div class="main-characters-container">
      """),_display_(/*13.8*/for(r <- res.take(5)) yield /*13.29*/{_display_(Seq[Any](format.raw/*13.30*/("""
          
          """),format.raw/*15.11*/("""<div class="content">
            <a href=""""),_display_(/*16.23*/r/*16.24*/.origin.url),format.raw/*16.35*/("""">
              <img class="main-characters" src=""""),_display_(/*17.50*/r/*17.51*/.image),format.raw/*17.57*/("""">
              <p class="main-characters-name">"""),_display_(/*18.48*/r/*18.49*/.name),format.raw/*18.54*/("""</p>
            </a>
          </div>
      """)))}),format.raw/*21.8*/("""
    """),format.raw/*22.5*/("""</div>
  </div>
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(res:List[domain.characters.Result]): play.twirl.api.HtmlFormat.Appendable = apply(res)

  def f:((List[domain.characters.Result]) => play.twirl.api.HtmlFormat.Appendable) = (res) => apply(res)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 90aa4d3ded4f1767d22bc265d3a60a23ec0e3d6c
                  MATRIX: 791->1|921->38|948->40|979->63|1018->65|1047->68|1419->414|1456->435|1495->436|1545->458|1616->502|1626->503|1658->514|1737->566|1747->567|1774->573|1851->623|1861->624|1887->629|1963->675|1995->680|2042->697
                  LINES: 22->1|27->2|28->3|28->3|28->3|29->4|38->13|38->13|38->13|40->15|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|46->21|47->22|49->24
                  -- GENERATED --
              */
          