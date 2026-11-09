
package org.openapitools.client.model


case class BerryDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. */
    _growthTime: Option[Integer],
    /* The maximum number of these berries that can grow on one tree in Generation IV. */
    _maxHarvest: Option[Integer],
    /* The power of the move \"Natural Gift\" when used with this Berry. */
    _naturalGiftPower: Option[Integer],
    /* The size of this Berry, in millimeters. */
    _size: Option[Integer],
    /* The smoothness of this Berry, used in making Pokéblocks or Poffins. */
    _smoothness: Option[Integer],
    /* The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. */
    _soilDryness: Option[Integer],
    /* The firmness of this berry, used in making Pokéblocks or Poffins. */
    _firmness: BerryFirmnessSummary,
    /* A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. */
    _flavors: List[BerryFlavorMap],
    /* Berries are actually items. This is a reference to the item specific data for this berry. */
    _item: ItemSummary,
    /* The type inherited by \"Natural Gift\" when used with this Berry. */
    _naturalGiftType: TypeSummary
)
object BerryDetail {
    def toStringBody(var_id: Object, var_name: Object, var_growthTime: Object, var_maxHarvest: Object, var_naturalGiftPower: Object, var_size: Object, var_smoothness: Object, var_soilDryness: Object, var_firmness: Object, var_flavors: Object, var_item: Object, var_naturalGiftType: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"growthTime":$var_growthTime,"maxHarvest":$var_maxHarvest,"naturalGiftPower":$var_naturalGiftPower,"size":$var_size,"smoothness":$var_smoothness,"soilDryness":$var_soilDryness,"firmness":$var_firmness,"flavors":$var_flavors,"item":$var_item,"naturalGiftType":$var_naturalGiftType
        | }
        """.stripMargin
}
