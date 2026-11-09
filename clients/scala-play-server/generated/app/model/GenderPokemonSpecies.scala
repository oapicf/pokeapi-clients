package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenderPokemonSpecies.
  * @param rate The chance of this Pokémon being female, in eighths; or -1 for genderless.
  * @param pokemonSpecies A Pokémon species that can be the referenced gender.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GenderPokemonSpecies(
  rate: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

object GenderPokemonSpecies {
  implicit lazy val genderPokemonSpeciesJsonFormat: Format[GenderPokemonSpecies] = Json.format[GenderPokemonSpecies]
}

