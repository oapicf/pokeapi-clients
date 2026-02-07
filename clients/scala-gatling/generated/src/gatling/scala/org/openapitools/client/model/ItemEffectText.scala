
package org.openapitools.client.model


case class ItemEffectText (
    _effect: String,
    _shortEffect: String,
    _language: LanguageSummary
)
object ItemEffectText {
    def toStringBody(var_effect: Object, var_shortEffect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"shortEffect":$var_shortEffect,"language":$var_language
        | }
        """.stripMargin
}
