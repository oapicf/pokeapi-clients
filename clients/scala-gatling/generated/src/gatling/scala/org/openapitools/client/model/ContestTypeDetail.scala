
package org.openapitools.client.model


case class ContestTypeDetail (
    _id: Integer,
    _name: String,
    _berryFlavor: BerryFlavorSummary,
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
