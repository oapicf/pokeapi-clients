
package org.openapitools.client.model


case class EvolutionTriggerName (
    /* The localized name for an API resource in a specific language. */
    _name: String,
    /* The language this name is in. */
    _language: LanguageSummary
)
object EvolutionTriggerName {
    def toStringBody(var_name: Object, var_language: Object) =
        s"""
        | {
        | "name":$var_name,"language":$var_language
        | }
        """.stripMargin
}
