
package org.openapitools.client.model


case class AbilityEffectText (
    /* The localized effect text for an API resource in a specific language. */
    _effect: String,
    /* The localized effect text in brief. */
    _shortEffect: String,
    /* The language this effect is in. */
    _language: LanguageSummary
)
object AbilityEffectText {
    def toStringBody(var_effect: Object, var_shortEffect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"shortEffect":$var_shortEffect,"language":$var_language
        | }
        """.stripMargin
}
