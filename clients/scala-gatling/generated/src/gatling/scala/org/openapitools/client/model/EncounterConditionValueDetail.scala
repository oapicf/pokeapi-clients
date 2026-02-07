
package org.openapitools.client.model


case class EncounterConditionValueDetail (
    _id: Integer,
    _name: String,
    _condition: EncounterConditionSummary,
    _names: List[EncounterConditionValueName]
)
object EncounterConditionValueDetail {
    def toStringBody(var_id: Object, var_name: Object, var_condition: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"condition":$var_condition,"names":$var_names
        | }
        """.stripMargin
}
