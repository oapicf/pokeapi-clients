package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param locations A list of locations that can be found in this region. for example: ''null''
 * @param mainGeneration The generation this region was introduced in. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokedexes A list of pokédexes that catalogue Pokémon in this region. for example: ''null''
 * @param versionGroups A list of version groups where this region can be visited. for example: ''null''
*/
final case class RegionDetail (
  id: Int,
  name: String,
  locations: Seq[LocationSummary],
  mainGeneration: GenerationSummary,
  names: Seq[RegionName],
  pokedexes: Seq[PokedexSummary],
  versionGroups: Seq[VersionGroupSummary]
)

