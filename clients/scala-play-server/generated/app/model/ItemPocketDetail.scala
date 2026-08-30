package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemPocketDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemPocketDetail(
  id: Int,
  name: String,
  categories: List[ItemCategorySummary],
  names: List[ItemPocketName]
)

object ItemPocketDetail {
  implicit lazy val itemPocketDetailJsonFormat: Format[ItemPocketDetail] = Json.format[ItemPocketDetail]
}

