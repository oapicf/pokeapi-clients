package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonSpecies A list of the Pokémon species that have this color. for example: ''null''
*/
final case class PokemonColorDetail (
  id: Int,
  name: String,
  names: Seq[PokemonColorName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

