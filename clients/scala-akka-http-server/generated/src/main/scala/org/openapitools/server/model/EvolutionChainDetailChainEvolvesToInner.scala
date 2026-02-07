package org.openapitools.server.model


/**
 * @param evolutionDetails  for example: ''null''
 * @param isBaby  for example: ''null''
 * @param species  for example: ''null''
*/
final case class EvolutionChainDetailChainEvolvesToInner (
  evolutionDetails: Seq[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
  isBaby: Boolean,
  species: AbilityDetailPokemonInnerPokemon
)

