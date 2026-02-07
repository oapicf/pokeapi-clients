package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param growthTime  for example: ''null''
 * @param maxHarvest  for example: ''null''
 * @param naturalGiftPower  for example: ''null''
 * @param size  for example: ''null''
 * @param smoothness  for example: ''null''
 * @param soilDryness  for example: ''null''
 * @param firmness  for example: ''null''
 * @param flavors  for example: ''null''
 * @param item  for example: ''null''
 * @param naturalGiftType  for example: ''null''
*/
final case class BerryDetail (
  id: Int,
  name: String,
  growthTime: Int,
  maxHarvest: Int,
  naturalGiftPower: Int,
  size: Int,
  smoothness: Int,
  soilDryness: Int,
  firmness: BerryFirmnessSummary,
  flavors: Seq[BerryDetailFlavorsInner],
  item: ItemSummary,
  naturalGiftType: TypeSummary
)

