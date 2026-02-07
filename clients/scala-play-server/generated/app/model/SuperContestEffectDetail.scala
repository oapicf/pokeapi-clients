package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SuperContestEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SuperContestEffectDetail(
  id: Int,
  appeal: Int,
  flavorTextEntries: List[SuperContestEffectFlavorText],
  moves: List[MoveSummary]
)

object SuperContestEffectDetail {
  implicit lazy val superContestEffectDetailJsonFormat: Format[SuperContestEffectDetail] = Json.format[SuperContestEffectDetail]
}

