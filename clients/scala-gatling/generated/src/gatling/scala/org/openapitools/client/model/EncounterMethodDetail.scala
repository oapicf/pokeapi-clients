
package org.openapitools.client.model


case class EncounterMethodDetail (
    _id: Integer,
    _name: String,
    _order: Option[Integer],
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
