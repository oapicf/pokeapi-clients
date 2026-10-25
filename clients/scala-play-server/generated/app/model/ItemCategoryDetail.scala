package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemCategoryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

