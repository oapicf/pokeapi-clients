package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemPrice.
  * @param purchasePrice The purchase price in this currency and version group, or null if unavailable.
  * @param sellPrice The sell price in this currency and version group, or null if unavailable.
  * @param currency The currency used for this price.
  * @param versionGroup The version group to which this price applies.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemPrice(
  purchasePrice: Option[Int],
  sellPrice: Option[Int],
  currency: CurrencySummary,
  versionGroup: VersionGroupSummary
)

object ItemPrice {
  implicit lazy val itemPriceJsonFormat: Format[ItemPrice] = Json.format[ItemPrice]
}

