package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param decreasedStat The stat decreased by 10% in Pokémon with this nature.
  * @param increasedStat The stat increased by 10% in Pokémon with this nature.
  * @param likesFlavor The flavor liked by Pokémon with this nature.
  * @param hatesFlavor The flavor hated by Pokémon with this nature.
  * @param pokeathlonStatChanges A list of Pokéathlon stats this nature effects and how much it effects them.
  * @param moveBattleStylePreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NatureDetail(
  id: Int,
  name: String,
  decreasedStat: StatSummary,
  increasedStat: StatSummary,
  likesFlavor: BerryFlavorSummary,
  hatesFlavor: BerryFlavorSummary,
  pokeathlonStatChanges: List[NaturePokeathlonStat],
  moveBattleStylePreferences: List[NatureBattleStylePreference],
  names: List[NatureName]
)

object NatureDetail {
  implicit lazy val natureDetailJsonFormat: Format[NatureDetail] = Json.format[NatureDetail]
}

