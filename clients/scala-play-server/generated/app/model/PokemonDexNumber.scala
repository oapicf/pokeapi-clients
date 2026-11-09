package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDexNumber.
  * @param entryNumber The index of this Pokémon species entry within the Pokédex.
  * @param pokemonSpecies The Pokémon species being encountered.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonDexNumber(
  entryNumber: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

object PokemonDexNumber {
  implicit lazy val pokemonDexNumberJsonFormat: Format[PokemonDexNumber] = Json.format[PokemonDexNumber]
}

