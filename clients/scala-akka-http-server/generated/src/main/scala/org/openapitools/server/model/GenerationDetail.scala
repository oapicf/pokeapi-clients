package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param abilities  for example: ''null''
 * @param mainRegion  for example: ''null''
 * @param moves  for example: ''null''
 * @param names  for example: ''null''
 * @param pokemonSpecies  for example: ''null''
 * @param types  for example: ''null''
 * @param versionGroups  for example: ''null''
*/
final case class GenerationDetail (
  id: Int,
  name: String,
  abilities: Seq[AbilitySummary],
  mainRegion: RegionSummary,
  moves: Seq[MoveSummary],
  names: Seq[GenerationName],
  pokemonSpecies: Seq[PokemonSpeciesSummary],
  types: Seq[TypeSummary],
  versionGroups: Seq[VersionGroupSummary]
)

