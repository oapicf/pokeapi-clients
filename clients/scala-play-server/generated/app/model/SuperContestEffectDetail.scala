package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SuperContestEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SuperContestEffectDetail(
  id: Int,
  appeal: Int,
  flavorTextEntries: List[SuperContestEffectFlavorText],
  moves: List[MoveSummary]
)

object SuperContestEffectDetail {
  implicit lazy val superContestEffectDetailJsonFormat: Format[SuperContestEffectDetail] = Json.format[SuperContestEffectDetail]
}

