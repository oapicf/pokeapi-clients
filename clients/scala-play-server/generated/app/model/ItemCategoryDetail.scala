package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemCategoryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

