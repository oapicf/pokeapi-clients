
package org.openapitools.client.model


case class ContestTypeDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The berry flavor that correlates with this contest type. */
    _berryFlavor: BerryFlavorSummary,
    /* The name of this contest type listed in different languages. */
    _names: List[ContestTypeName]
)
object ContestTypeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_berryFlavor: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"berryFlavor":$var_berryFlavor,"names":$var_names
        | }
        """.stripMargin
}
