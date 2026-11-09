package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param babyTriggerItem The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. for example: ''null''
 * @param chain The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. for example: ''null''
*/
final case class EvolutionChainDetail (
  id: Int,
  babyTriggerItem: ItemSummary,
  chain: EvolutionChainLink
)

