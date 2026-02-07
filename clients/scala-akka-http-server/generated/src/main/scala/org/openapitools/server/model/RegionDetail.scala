package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param locations  for example: ''null''
 * @param mainGeneration  for example: ''null''
 * @param names  for example: ''null''
 * @param pokedexes  for example: ''null''
 * @param versionGroups  for example: ''null''
*/
final case class RegionDetail (
  id: Int,
  name: String,
  locations: Seq[LocationSummary],
  mainGeneration: GenerationSummary,
  names: Seq[RegionName],
  pokedexes: Seq[PokedexSummary],
  versionGroups: Seq[AbilityDetailPokemonInnerPokemon]
)

