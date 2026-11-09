
package org.openapitools.client.model


case class EncounterConditionDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A list of possible values for this encounter condition. */
    _values: List[EncounterConditionValueSummary],
    /* The name of this resource listed in different languages. */
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
