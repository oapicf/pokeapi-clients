package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param babyTriggerItem  for example: ''null''
 * @param chain  for example: ''null''
*/
final case class EvolutionChainDetail (
  id: Int,
  babyTriggerItem: ItemSummary,
  chain: EvolutionChainDetailChain
)

