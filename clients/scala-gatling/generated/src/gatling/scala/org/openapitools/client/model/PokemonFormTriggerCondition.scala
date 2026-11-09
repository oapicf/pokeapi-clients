
package org.openapitools.client.model

import java.net.URI

case class PokemonFormTriggerCondition (
    /* The trigger for this form change. */
    _trigger: String,
    /* The name of the required item, ability, or move. Only present for a resource-based trigger. */
    _name: Option[String],
    /* The URL of the required item, ability, or move. Only present for a resource-based trigger. */
    _url: Option[URI],
    /* The required base form. Only present when the trigger specifies one. */
    _baseForm: Option[PokemonFormSummary]
)
object PokemonFormTriggerCondition {
    def toStringBody(var_trigger: Object, var_name: Object, var_url: Object, var_baseForm: Object) =
        s"""
        | {
        | "trigger":$var_trigger,"name":$var_name,"url":$var_url,"baseForm":$var_baseForm
        | }
        """.stripMargin
}
