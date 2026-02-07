package org.openapitools.server.model


/**
 * @param entryNumber  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
*/
final case class PokedexDetailPokemonEntriesInner (
  entryNumber: Int,
  pokemonSpecies: AbilityDetailPokemonInnerPokemon
)

