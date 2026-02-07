
package org.openapitools.client.model


case class BerryFlavorDetail (
    _id: Integer,
    _name: String,
    _berries: List[BerryFlavorDetailBerriesInner],
    _contestType: ContestTypeSummary,
    _names: List[BerryFlavorName]
)
object BerryFlavorDetail {
    def toStringBody(var_id: Object, var_name: Object, var_berries: Object, var_contestType: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"berries":$var_berries,"contestType":$var_contestType,"names":$var_names
        | }
        """.stripMargin
}
