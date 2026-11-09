package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonSpeciesGenus.
  * @param genus The localized genus for the referenced Pokémon species
  * @param language The language this genus is in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonSpeciesGenus(
  genus: String,
  language: LanguageSummary
)

object PokemonSpeciesGenus {
  implicit lazy val pokemonSpeciesGenusJsonFormat: Format[PokemonSpeciesGenus] = Json.format[PokemonSpeciesGenus]
}

