package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param effectEntries The result of this fling effect listed in different languages. for example: ''null''
 * @param items A list of items that have this fling effect. for example: ''null''
*/
final case class ItemFlingEffectDetail (
  id: Int,
  name: String,
  effectEntries: Seq[ItemFlingEffectEffectText],
  items: Seq[ItemSummary]
)

