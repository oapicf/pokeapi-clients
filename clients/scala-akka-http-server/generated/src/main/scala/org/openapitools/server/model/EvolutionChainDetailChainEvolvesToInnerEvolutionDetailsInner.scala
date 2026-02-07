package org.openapitools.server.model


/**
 * @param gender  for example: ''null''
 * @param heldItem  for example: ''null''
 * @param item  for example: ''null''
 * @param knownMove  for example: ''null''
 * @param knownMoveType  for example: ''null''
 * @param location  for example: ''null''
 * @param minAffection  for example: ''null''
 * @param minBeauty  for example: ''null''
 * @param minHappiness  for example: ''null''
 * @param minLevel  for example: ''null''
 * @param needsOverworldRain  for example: ''null''
 * @param partySpecies  for example: ''null''
 * @param partyType  for example: ''null''
 * @param relativePhysicalStats  for example: ''null''
 * @param timeOfDay  for example: ''null''
 * @param tradeSpecies  for example: ''null''
 * @param trigger  for example: ''null''
 * @param turnUpsideDown  for example: ''null''
*/
final case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner (
  gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  knownMove: Any,
  knownMoveType: Any,
  location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  minAffection: Int,
  minBeauty: Int,
  minHappiness: Int,
  minLevel: Int,
  needsOverworldRain: Boolean,
  partySpecies: String,
  partyType: String,
  relativePhysicalStats: String,
  timeOfDay: String,
  tradeSpecies: String,
  trigger: AbilityDetailPokemonInnerPokemon,
  turnUpsideDown: Boolean
)

