package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param items  for example: ''null''
 * @param names  for example: ''null''
 * @param pocket  for example: ''null''
*/
final case class ItemCategoryDetail (
  id: Int,
  name: String,
  items: Seq[ItemSummary],
  names: Seq[ItemCategoryName],
  pocket: ItemPocketSummary
)

