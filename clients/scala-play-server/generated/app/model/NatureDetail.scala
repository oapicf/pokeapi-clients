package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class NatureDetail(
  id: Int,
  name: String,
  decreasedStat: StatSummary,
  increasedStat: StatSummary,
  likesFlavor: BerryFlavorSummary,
  hatesFlavor: BerryFlavorSummary,
  berries: List[BerrySummary],
  pokeathlonStatChanges: List[NatureDetailPokeathlonStatChangesInner],
  moveBattleStylePreferences: List[NatureBattleStylePreference],
  names: List[NatureName]
)

object NatureDetail {
  implicit lazy val natureDetailJsonFormat: Format[NatureDetail] = Json.format[NatureDetail]
}

