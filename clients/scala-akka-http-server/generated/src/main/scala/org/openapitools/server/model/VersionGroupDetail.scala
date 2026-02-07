package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param order  for example: ''null''
 * @param generation  for example: ''null''
 * @param moveLearnMethods  for example: ''null''
 * @param pokedexes  for example: ''null''
 * @param regions  for example: ''null''
 * @param versions  for example: ''null''
*/
final case class VersionGroupDetail (
  id: Int,
  name: String,
  order: Option[Int] = None,
  generation: GenerationSummary,
  moveLearnMethods: Seq[AbilityDetailPokemonInnerPokemon],
  pokedexes: Seq[AbilityDetailPokemonInnerPokemon],
  regions: Seq[AbilityDetailPokemonInnerPokemon],
  versions: Seq[VersionSummary]
)

