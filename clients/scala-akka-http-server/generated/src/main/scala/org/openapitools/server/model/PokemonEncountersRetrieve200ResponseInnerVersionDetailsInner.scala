package org.openapitools.server.model


/**
 * @param encounterDetails  for example: ''null''
 * @param maxChance  for example: ''100''
 * @param version  for example: ''null''
*/
final case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner (
  encounterDetails: Seq[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner],
  maxChance: Double,
  version: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion
)

