package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param baseExperience  for example: ''null''
 * @param height  for example: ''null''
 * @param isDefault  for example: ''null''
 * @param order  for example: ''null''
 * @param weight  for example: ''null''
 * @param abilities  for example: ''null''
 * @param pastAbilities  for example: ''null''
 * @param forms  for example: ''null''
 * @param gameIndices  for example: ''null''
 * @param heldItems  for example: ''null''
 * @param locationAreaEncounters  for example: ''null''
 * @param moves  for example: ''null''
 * @param species  for example: ''null''
 * @param sprites  for example: ''null''
 * @param cries  for example: ''null''
 * @param stats  for example: ''null''
 * @param types  for example: ''null''
 * @param pastTypes  for example: ''null''
*/
final case class PokemonDetail (
  id: Int,
  name: String,
  baseExperience: Option[Int] = None,
  height: Option[Int] = None,
  isDefault: Option[Boolean] = None,
  order: Option[Int] = None,
  weight: Option[Int] = None,
  abilities: Seq[PokemonDetailAbilitiesInner],
  pastAbilities: Seq[PokemonDetailPastAbilitiesInner],
  forms: Seq[PokemonFormSummary],
  gameIndices: Seq[PokemonGameIndex],
  heldItems: PokemonDetailHeldItems,
  locationAreaEncounters: String,
  moves: Seq[PokemonDetailMovesInner],
  species: PokemonSpeciesSummary,
  sprites: PokemonDetailSprites,
  cries: PokemonDetailCries,
  stats: Seq[PokemonStat],
  types: Seq[PokemonDetailTypesInner],
  pastTypes: Seq[PokemonDetailPastTypesInner]
)

