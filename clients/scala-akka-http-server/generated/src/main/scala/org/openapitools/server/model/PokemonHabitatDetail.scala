package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
*/
final case class PokemonHabitatDetail (
  id: Int,
  name: String,
  names: Seq[PokemonHabitatName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

