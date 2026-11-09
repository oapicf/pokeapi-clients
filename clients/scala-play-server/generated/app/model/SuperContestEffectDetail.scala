package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SuperContestEffectDetail.
  * @param id The identifier for this resource.
  * @param appeal The level of appeal this super contest effect has.
  * @param flavorTextEntries The flavor text of this super contest effect listed in different languages.
  * @param moves A list of moves that have the effect when used in super contests.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SuperContestEffectDetail(
  id: Int,
  appeal: Int,
  flavorTextEntries: List[SuperContestEffectFlavorText],
  moves: List[MoveSummary]
)

object SuperContestEffectDetail {
  implicit lazy val superContestEffectDetailJsonFormat: Format[SuperContestEffectDetail] = Json.format[SuperContestEffectDetail]
}

