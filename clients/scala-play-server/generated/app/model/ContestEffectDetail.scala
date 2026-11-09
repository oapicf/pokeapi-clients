package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestEffectDetail.
  * @param id The identifier for this resource.
  * @param appeal The base number of hearts the user of this move gets.
  * @param jam The base number of hearts the user's opponent loses.
  * @param effectEntries The result of this contest effect listed in different languages.
  * @param flavorTextEntries The flavor text of this contest effect listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ContestEffectDetail(
  id: Int,
  appeal: Int,
  jam: Int,
  effectEntries: List[ContestEffectEffectText],
  flavorTextEntries: List[ContestEffectFlavorText]
)

object ContestEffectDetail {
  implicit lazy val contestEffectDetailJsonFormat: Format[ContestEffectDetail] = Json.format[ContestEffectDetail]
}

