package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContestEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

