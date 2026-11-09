
package org.openapitools.client.model


case class EncounterMethodDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A good value for sorting. */
    _order: Option[Integer],
    /* The name of this resource listed in different languages. */
    _names: List[EncounterMethodName]
)
object EncounterMethodDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"names":$var_names
        | }
        """.stripMargin
}
