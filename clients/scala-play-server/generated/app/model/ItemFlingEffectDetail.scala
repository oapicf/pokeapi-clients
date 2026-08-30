package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlingEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemFlingEffectDetail(
  id: Int,
  name: String,
  effectEntries: List[ItemFlingEffectEffectText],
  items: List[ItemSummary]
)

object ItemFlingEffectDetail {
  implicit lazy val itemFlingEffectDetailJsonFormat: Format[ItemFlingEffectDetail] = Json.format[ItemFlingEffectDetail]
}

