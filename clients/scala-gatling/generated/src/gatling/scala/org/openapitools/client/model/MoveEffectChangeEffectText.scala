
package org.openapitools.client.model


case class MoveEffectChangeEffectText (
    /* The localized effect text for an API resource in a specific language. */
    _effect: String,
    /* The language this effect is in. */
    _language: LanguageSummary
)
object MoveEffectChangeEffectText {
    def toStringBody(var_effect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"language":$var_language
        | }
        """.stripMargin
}
