package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemCategoryDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param items A list of items that are a part of this category.
  * @param names The name of this item category listed in different languages.
  * @param pocket The pocket items in this category would be put in.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemCategoryDetail(
  id: Int,
  name: String,
  items: List[ItemSummary],
  names: List[ItemCategoryName],
  pocket: ItemPocketSummary
)

object ItemCategoryDetail {
  implicit lazy val itemCategoryDetailJsonFormat: Format[ItemCategoryDetail] = Json.format[ItemCategoryDetail]
}

