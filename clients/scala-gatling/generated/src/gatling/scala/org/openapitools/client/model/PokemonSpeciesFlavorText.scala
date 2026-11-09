
package org.openapitools.client.model


case class PokemonSpeciesFlavorText (
    /* The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more.  */
    _flavorText: String,
    /* The language this name is in. */
    _language: LanguageSummary,
    /* The game version this flavor text is extracted from. */
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
