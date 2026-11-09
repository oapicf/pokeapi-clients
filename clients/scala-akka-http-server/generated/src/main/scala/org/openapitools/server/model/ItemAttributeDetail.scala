package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param descriptions The description of this item attribute listed in different languages. for example: ''null''
 * @param items A list of items that have this attribute. for example: ''null''
 * @param names The name of this item attribute listed in different languages. for example: ''null''
*/
final case class ItemAttributeDetail (
  id: Int,
  name: String,
  descriptions: Seq[ItemAttributeDescription],
  items: Seq[ItemSummary],
  names: Seq[ItemAttributeName]
)

