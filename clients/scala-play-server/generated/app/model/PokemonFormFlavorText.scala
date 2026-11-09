package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonFormFlavorText.
  * @param flavorText The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
  * @param language The language this name is in.
  * @param version The game version this flavor text is extracted from.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonFormFlavorText(
  flavorText: String,
  language: LanguageSummary,
  version: VersionSummary
)

object PokemonFormFlavorText {
  implicit lazy val pokemonFormFlavorTextJsonFormat: Format[PokemonFormFlavorText] = Json.format[PokemonFormFlavorText]
}

