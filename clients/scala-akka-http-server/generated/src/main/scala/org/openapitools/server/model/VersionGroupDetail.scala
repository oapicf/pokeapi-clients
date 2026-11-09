package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param order Order for sorting. Almost by date of release, except similar versions are grouped together. for example: ''null''
 * @param generation The generation this version was introduced in. for example: ''null''
 * @param moveLearnMethods A list of methods in which Pokémon can learn moves in this version group. for example: ''null''
 * @param pokedexes A list of Pokédexes introduces in this version group. for example: ''null''
 * @param regions A list of regions that can be visited in this version group. for example: ''null''
 * @param versions The versions this version group owns. for example: ''null''
*/
final case class VersionGroupDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  generation: GenerationSummary,
  moveLearnMethods: Seq[MoveLearnMethodSummary],
  pokedexes: Seq[PokedexSummary],
  regions: Seq[RegionSummary],
  versions: Seq[VersionSummary]
)

