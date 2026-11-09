package org.openapitools.server.model


/**
 * @param entryNumber The index number within the Pokédex. for example: ''null''
 * @param pokedex The Pokédex the referenced Pokémon species can be found in. for example: ''null''
*/
final case class PokemonDexEntry (
  entryNumber: Int,
  pokedex: PokedexSummary
)

