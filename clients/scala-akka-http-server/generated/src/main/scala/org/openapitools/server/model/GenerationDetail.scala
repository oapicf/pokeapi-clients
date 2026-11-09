package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param abilities A list of abilities that were introduced in this generation. for example: ''null''
 * @param mainRegion The main region travelled in this generation. for example: ''null''
 * @param moves A list of moves that were introduced in this generation. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonSpecies A list of Pokémon species that were introduced in this generation. for example: ''null''
 * @param types A list of types that were introduced in this generation. for example: ''null''
 * @param versionGroups A list of version groups that were introduced in this generation. for example: ''null''
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

