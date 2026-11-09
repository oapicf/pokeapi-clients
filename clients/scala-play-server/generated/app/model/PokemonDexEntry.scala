package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonDexEntry.
  * @param entryNumber The index number within the Pokédex.
  * @param pokedex The Pokédex the referenced Pokémon species can be found in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonDexEntry(
  entryNumber: Int,
  pokedex: PokedexSummary
)

object PokemonDexEntry {
  implicit lazy val pokemonDexEntryJsonFormat: Format[PokemonDexEntry] = Json.format[PokemonDexEntry]
}

