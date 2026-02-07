package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
*/
final case class PokemonColorDetail (
  id: Int,
  name: String,
  names: Seq[PokemonColorName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

