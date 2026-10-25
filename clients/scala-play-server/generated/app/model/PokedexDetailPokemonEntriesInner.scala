package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDetail_pokemon_entries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokedexDetailPokemonEntriesInner(
  entryNumber: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon
)

object PokedexDetailPokemonEntriesInner {
  implicit lazy val pokedexDetailPokemonEntriesInnerJsonFormat: Format[PokedexDetailPokemonEntriesInner] = Json.format[PokedexDetailPokemonEntriesInner]
}

