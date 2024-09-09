package domain.characters

import play.api.libs.json._


case class CharWrapper(
	results:List[Result]
)

object CharWrapper:
	given Reads[CharWrapper] = Json.reads[CharWrapper]

case class Result(
	name:String,
	status:String,
	species:String,
	gender:String,
	origin:Origin,
	location:Location,
	image:String,
	episode:List[String]
)


object Result:
	given Reads[Result] = Json.reads[Result]

case class Location(
	name:String,
	url:String
)
object Location:
	given Reads[Location] = Json.reads[Location]

case class Origin(
	name:String,
	url:String
)

object Origin:
	given Reads[Origin] = Json.reads[Origin]
