package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param categories A list of item categories that are relevant to this item pocket. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class ItemPocketDetail (
  id: Int,
  name: String,
  categories: Seq[ItemCategorySummary],
  names: Seq[ItemPocketName]
)

