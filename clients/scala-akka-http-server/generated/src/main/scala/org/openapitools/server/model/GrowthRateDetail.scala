package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param formula  for example: ''null''
 * @param descriptions  for example: ''null''
 * @param levels  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
*/
final case class GrowthRateDetail (
  id: Int,
  name: String,
  formula: String,
  descriptions: Seq[GrowthRateDescription],
  levels: Seq[Experience],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

