
package org.openapitools.client.model


case class BerryFirmnessDetail (
    _id: Integer,
    _name: String,
    _berries: List[BerrySummary],
    _names: List[BerryFirmnessName]
)
object BerryFirmnessDetail {
    def toStringBody(var_id: Object, var_name: Object, var_berries: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"berries":$var_berries,"names":$var_names
        | }
        """.stripMargin
}
