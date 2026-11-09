package org.openapitools.server.model


/**
 * @param rate The chance of this Pokémon being female, in eighths; or -1 for genderless. for example: ''null''
 * @param pokemonSpecies A Pokémon species that can be the referenced gender. for example: ''null''
*/
final case class GenderPokemonSpecies (
  rate: Int,
  pokemonSpecies: PokemonSpeciesSummary
)

