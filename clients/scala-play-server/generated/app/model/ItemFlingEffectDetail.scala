package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlingEffectDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param effectEntries The result of this fling effect listed in different languages.
  * @param items A list of items that have this fling effect.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemFlingEffectDetail(
  id: Int,
  name: String,
  effectEntries: List[ItemFlingEffectEffectText],
  items: List[ItemSummary]
)

object ItemFlingEffectDetail {
  implicit lazy val itemFlingEffectDetailJsonFormat: Format[ItemFlingEffectDetail] = Json.format[ItemFlingEffectDetail]
}

