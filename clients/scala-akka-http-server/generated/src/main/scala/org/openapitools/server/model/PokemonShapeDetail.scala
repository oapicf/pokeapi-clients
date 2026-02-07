package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param awesomeNames  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
*/
final case class PokemonShapeDetail (
  id: Int,
  name: String,
  awesomeNames: Seq[PokemonShapeDetailAwesomeNamesInner],
  names: Seq[PokemonShapeDetailNamesInner],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

