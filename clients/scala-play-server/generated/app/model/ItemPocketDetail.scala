package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemPocketDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemPocketDetail(
  id: Int,
  name: String,
  categories: List[ItemCategorySummary],
  names: List[ItemPocketName]
)

object ItemPocketDetail {
  implicit lazy val itemPocketDetailJsonFormat: Format[ItemPocketDetail] = Json.format[ItemPocketDetail]
}

