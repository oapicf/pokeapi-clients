package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemPocketDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param categories A list of item categories that are relevant to this item pocket.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemPocketDetail(
  id: Int,
  name: String,
  categories: List[ItemCategorySummary],
  names: List[ItemPocketName]
)

object ItemPocketDetail {
  implicit lazy val itemPocketDetailJsonFormat: Format[ItemPocketDetail] = Json.format[ItemPocketDetail]
}

