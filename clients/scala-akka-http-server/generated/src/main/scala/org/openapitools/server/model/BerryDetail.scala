package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param growthTime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. for example: ''null''
 * @param maxHarvest The maximum number of these berries that can grow on one tree in Generation IV. for example: ''null''
 * @param naturalGiftPower The power of the move \"Natural Gift\" when used with this Berry. for example: ''null''
 * @param size The size of this Berry, in millimeters. for example: ''null''
 * @param smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins. for example: ''null''
 * @param soilDryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. for example: ''null''
 * @param firmness The firmness of this berry, used in making Pokéblocks or Poffins. for example: ''null''
 * @param flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. for example: ''null''
 * @param item Berries are actually items. This is a reference to the item specific data for this berry. for example: ''null''
 * @param naturalGiftType The type inherited by \"Natural Gift\" when used with this Berry. for example: ''null''
*/
final case class BerryDetail (
  id: Int,
  name: String,
  growthTime: Option[Int] = None,
  maxHarvest: Option[Int] = None,
  naturalGiftPower: Option[Int] = None,
  size: Option[Int] = None,
  smoothness: Option[Int] = None,
  soilDryness: Option[Int] = None,
  firmness: BerryFirmnessSummary,
  flavors: Seq[BerryFlavorMap],
  item: ItemSummary,
  naturalGiftType: TypeSummary
)

