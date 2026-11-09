
package org.openapitools.client.model


case class ContestEffectFlavorText (
    /* The localized flavor text for an API resource in a specific language. */
    _flavorText: String,
    /* The language this name is in. */
    _language: LanguageSummary
)
object ContestEffectFlavorText {
    def toStringBody(var_flavorText: Object, var_language: Object) =
        s"""
        | {
        | "flavorText":$var_flavorText,"language":$var_language
        | }
        """.stripMargin
}
