
package org.openapitools.client.model


case class SuperContestEffectFlavorText (
    _flavorText: String,
    _language: LanguageSummary
)
object SuperContestEffectFlavorText {
    def toStringBody(var_flavorText: Object, var_language: Object) =
        s"""
        | {
        | "flavorText":$var_flavorText,"language":$var_language
        | }
        """.stripMargin
}
