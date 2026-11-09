package org.openapitools.server.model


/**
 * @param isBaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. for example: ''null''
 * @param species The Pokémon species at this point in the evolution chain. for example: ''null''
 * @param evolutionDetails All details regarding the specific details of the referenced Pokémon species evolution. for example: ''null''
 * @param evolvesTo A List of chain objects. for example: ''null''
*/
final case class EvolutionChainLink (
  isBaby: Boolean,
  species: PokemonSpeciesSummary,
  evolutionDetails: Seq[PokemonEvolution],
  evolvesTo: Seq[EvolutionChainLink]
)

