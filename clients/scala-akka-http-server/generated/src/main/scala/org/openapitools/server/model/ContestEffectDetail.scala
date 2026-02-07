package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param appeal  for example: ''null''
 * @param jam  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param flavorTextEntries  for example: ''null''
*/
final case class ContestEffectDetail (
  id: Int,
  appeal: Int,
  jam: Int,
  effectEntries: Seq[ContestEffectEffectText],
  flavorTextEntries: Seq[ContestEffectFlavorText]
)

