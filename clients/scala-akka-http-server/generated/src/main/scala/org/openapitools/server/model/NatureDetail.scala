package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param decreasedStat The stat decreased by 10% in Pokémon with this nature. for example: ''null''
 * @param increasedStat The stat increased by 10% in Pokémon with this nature. for example: ''null''
 * @param likesFlavor The flavor liked by Pokémon with this nature. for example: ''null''
 * @param hatesFlavor The flavor hated by Pokémon with this nature. for example: ''null''
 * @param pokeathlonStatChanges A list of Pokéathlon stats this nature effects and how much it effects them. for example: ''null''
 * @param moveBattleStylePreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class NatureDetail (
  id: Int,
  name: String,
  decreasedStat: StatSummary,
  increasedStat: StatSummary,
  likesFlavor: BerryFlavorSummary,
  hatesFlavor: BerryFlavorSummary,
  pokeathlonStatChanges: Seq[NaturePokeathlonStat],
  moveBattleStylePreferences: Seq[NatureBattleStylePreference],
  names: Seq[NatureName]
)

