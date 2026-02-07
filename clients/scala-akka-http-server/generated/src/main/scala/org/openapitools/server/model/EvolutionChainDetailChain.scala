package org.openapitools.server.model


/**
 * @param evolutionDetails  for example: ''null''
 * @param evolvesTo  for example: ''null''
 * @param isBaby  for example: ''null''
 * @param species  for example: ''null''
*/
final case class EvolutionChainDetailChain (
  evolutionDetails: Seq[AnyType],
  evolvesTo: Seq[EvolutionChainDetailChainEvolvesToInner],
  isBaby: Boolean,
  species: AbilityDetailPokemonInnerPokemon
)

