
package org.openapitools.client.model


case class ItemFlingEffectEffectText (
    _effect: String,
    _language: LanguageSummary
)
object ItemFlingEffectEffectText {
    def toStringBody(var_effect: Object, var_language: Object) =
        s"""
        | {
        | "effect":$var_effect,"language":$var_language
        | }
        """.stripMargin
}
