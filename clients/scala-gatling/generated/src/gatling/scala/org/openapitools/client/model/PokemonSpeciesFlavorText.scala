
package org.openapitools.client.model


case class PokemonSpeciesFlavorText (
    _flavorText: String,
    _language: LanguageSummary,
    _version: VersionSummary
)
object PokemonSpeciesFlavorText {
    def toStringBody(var_flavorText: Object, var_language: Object, var_version: Object) =
        s"""
        | {
        | "flavorText":$var_flavorText,"language":$var_language,"version":$var_version
        | }
        """.stripMargin
}
