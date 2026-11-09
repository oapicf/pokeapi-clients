
package org.openapitools.client.model


case class BerryFirmnessDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of the berries with this firmness. */
    _berries: List[BerrySummary],
    /* The name of this resource listed in different languages. */
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
