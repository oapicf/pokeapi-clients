package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemFlingEffectDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemFlingEffectDetail(
  id: Int,
  name: String,
  effectEntries: List[ItemFlingEffectEffectText],
  items: List[ItemSummary]
)

object ItemFlingEffectDetail {
  implicit lazy val itemFlingEffectDetailJsonFormat: Format[ItemFlingEffectDetail] = Json.format[ItemFlingEffectDetail]
}

