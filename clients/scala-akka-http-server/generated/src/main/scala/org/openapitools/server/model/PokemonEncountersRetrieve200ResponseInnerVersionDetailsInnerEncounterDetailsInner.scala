package org.openapitools.server.model


/**
 * @param chance  for example: ''100''
 * @param conditionValues  for example: ''null''
 * @param maxLevel  for example: ''10''
 * @param method  for example: ''null''
 * @param minLevel  for example: ''10''
*/
final case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner (
  chance: Double,
  conditionValues: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner],
  maxLevel: Double,
  method: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,
  minLevel: Double
)

