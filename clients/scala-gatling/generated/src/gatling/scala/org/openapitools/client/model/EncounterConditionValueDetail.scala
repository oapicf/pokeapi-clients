
package org.openapitools.client.model


case class EncounterConditionValueDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The condition this encounter condition value pertains to. */
    _condition: EncounterConditionSummary,
    /* The name of this resource listed in different languages. */
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
