package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesFlavorText.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonSpeciesFlavorText(
  flavorText: String,
  language: LanguageSummary,
  version: VersionSummary
)

object PokemonSpeciesFlavorText {
  implicit lazy val pokemonSpeciesFlavorTextJsonFormat: Format[PokemonSpeciesFlavorText] = Json.format[PokemonSpeciesFlavorText]
}

