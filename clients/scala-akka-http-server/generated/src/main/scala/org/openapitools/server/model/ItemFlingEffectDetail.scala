package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param items  for example: ''null''
*/
final case class ItemFlingEffectDetail (
  id: Int,
  name: String,
  effectEntries: Seq[ItemFlingEffectEffectText],
  items: Seq[ItemSummary]
)

