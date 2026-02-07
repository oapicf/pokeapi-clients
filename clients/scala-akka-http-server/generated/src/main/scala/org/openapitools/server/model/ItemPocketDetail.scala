package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param categories  for example: ''null''
 * @param names  for example: ''null''
*/
final case class ItemPocketDetail (
  id: Int,
  name: String,
  categories: Seq[ItemCategorySummary],
  names: Seq[ItemPocketName]
)

