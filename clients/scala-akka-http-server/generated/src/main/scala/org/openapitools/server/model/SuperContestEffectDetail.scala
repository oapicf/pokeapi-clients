package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param appeal  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
 * @param moves  for example: ''null''
*/
final case class SuperContestEffectDetail (
  id: Int,
  appeal: Int,
  flavorTextEntries: Seq[SuperContestEffectFlavorText],
  moves: Seq[MoveSummary]
)

