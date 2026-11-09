package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemAttributeDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param descriptions The description of this item attribute listed in different languages.
  * @param items A list of items that have this attribute.
  * @param names The name of this item attribute listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemAttributeDetail(
  id: Int,
  name: String,
  descriptions: List[ItemAttributeDescription],
  items: List[ItemSummary],
  names: List[ItemAttributeName]
)

object ItemAttributeDetail {
  implicit lazy val itemAttributeDetailJsonFormat: Format[ItemAttributeDetail] = Json.format[ItemAttributeDetail]
}

