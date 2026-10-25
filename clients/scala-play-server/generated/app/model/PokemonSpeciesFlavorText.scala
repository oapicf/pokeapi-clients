package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesFlavorText(
  flavorText: String,
  language: LanguageSummary,
  version: VersionSummary
)

object PokemonSpeciesFlavorText {
  implicit lazy val pokemonSpeciesFlavorTextJsonFormat: Format[PokemonSpeciesFlavorText] = Json.format[PokemonSpeciesFlavorText]
}

