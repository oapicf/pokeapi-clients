package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDetail_pokemon_entries_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokedexDetailPokemonEntriesInner(
  entryNumber: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon
)

object PokedexDetailPokemonEntriesInner {
  implicit lazy val pokedexDetailPokemonEntriesInnerJsonFormat: Format[PokedexDetailPokemonEntriesInner] = Json.format[PokedexDetailPokemonEntriesInner]
}

