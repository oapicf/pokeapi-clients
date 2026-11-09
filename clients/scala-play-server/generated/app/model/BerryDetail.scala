package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BerryDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param growthTime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
  * @param maxHarvest The maximum number of these berries that can grow on one tree in Generation IV.
  * @param naturalGiftPower The power of the move \"Natural Gift\" when used with this Berry.
  * @param size The size of this Berry, in millimeters.
  * @param smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins.
  * @param soilDryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
  * @param firmness The firmness of this berry, used in making Pokéblocks or Poffins.
  * @param flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
  * @param item Berries are actually items. This is a reference to the item specific data for this berry.
  * @param naturalGiftType The type inherited by \"Natural Gift\" when used with this Berry.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BerryDetail(
  id: Int,
  name: String,
  growthTime: Option[Int],
  maxHarvest: Option[Int],
  naturalGiftPower: Option[Int],
  size: Option[Int],
  smoothness: Option[Int],
  soilDryness: Option[Int],
  firmness: BerryFirmnessSummary,
  flavors: List[BerryFlavorMap],
  item: ItemSummary,
  naturalGiftType: TypeSummary
)

object BerryDetail {
  implicit lazy val berryDetailJsonFormat: Format[BerryDetail] = Json.format[BerryDetail]
}

