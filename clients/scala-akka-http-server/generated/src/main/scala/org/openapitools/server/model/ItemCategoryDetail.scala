package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param items A list of items that are a part of this category. for example: ''null''
 * @param names The name of this item category listed in different languages. for example: ''null''
 * @param pocket The pocket items in this category would be put in. for example: ''null''
*/
final case class ItemCategoryDetail (
  id: Int,
  name: String,
  items: Seq[ItemSummary],
  names: Seq[ItemCategoryName],
  pocket: ItemPocketSummary
)

