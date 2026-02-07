
package org.openapitools.client.model


case class BerryDetail (
    _id: Integer,
    _name: String,
    _growthTime: Integer,
    _maxHarvest: Integer,
    _naturalGiftPower: Integer,
    _size: Integer,
    _smoothness: Integer,
    _soilDryness: Integer,
    _firmness: BerryFirmnessSummary,
    _flavors: List[BerryDetailFlavorsInner],
    _item: ItemSummary,
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
