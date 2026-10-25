package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

