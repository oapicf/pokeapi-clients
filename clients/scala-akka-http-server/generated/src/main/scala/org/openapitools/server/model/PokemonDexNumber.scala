package org.openapitools.server.model


/**
 * @param entryNumber The index of this Pokémon species entry within the Pokédex. for example: ''null''
 * @param pokemonSpecies The Pokémon species being encountered. for example: ''null''
*/
final case class PokemonDexNumber (
  entryNumber: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

