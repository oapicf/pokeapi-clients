
package org.openapitools.client.model


case class BerryFlavorDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of the berries with this flavor. */
    _berries: List[BerryFlavorBerryMap],
    /* The contest type that correlates with this berry flavor. */
    _contestType: ContestTypeSummary,
    /* The name of this resource listed in different languages. */
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
