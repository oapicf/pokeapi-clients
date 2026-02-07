
package org.openapitools.client.model


case class EncounterConditionDetail (
    _id: Integer,
    _name: String,
    _values: List[EncounterConditionValueSummary],
    _names: List[EncounterConditionName]
)
object EncounterConditionDetail {
    def toStringBody(var_id: Object, var_name: Object, var_values: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"values":$var_values,"names":$var_names
        | }
        """.stripMargin
}
