package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

