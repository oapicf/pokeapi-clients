package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param decreasedStat  for example: ''null''
 * @param increasedStat  for example: ''null''
 * @param likesFlavor  for example: ''null''
 * @param hatesFlavor  for example: ''null''
 * @param berries  for example: ''null''
 * @param pokeathlonStatChanges  for example: ''null''
 * @param moveBattleStylePreferences  for example: ''null''
 * @param names  for example: ''null''
*/
final case class NatureDetail (
  id: Int,
  name: String,
  decreasedStat: StatSummary,
  increasedStat: StatSummary,
  likesFlavor: BerryFlavorSummary,
  hatesFlavor: BerryFlavorSummary,
  berries: Seq[BerrySummary],
  pokeathlonStatChanges: Seq[NatureDetailPokeathlonStatChangesInner],
  moveBattleStylePreferences: Seq[NatureBattleStylePreference],
  names: Seq[NatureName]
)

