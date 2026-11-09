package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemPrice._

case class ItemPrice (
  /* The purchase price in this currency and version group, or null if unavailable. */
  purchasePrice: Option[Integer],
/* The sell price in this currency and version group, or null if unavailable. */
  sellPrice: Option[Integer],
/* The currency used for this price. */
  currency: CurrencySummary,
/* The version group to which this price applies. */
  versionGroup: VersionGroupSummary)

object ItemPrice {
  import DateTimeCodecs._

  implicit val ItemPriceCodecJson: CodecJson[ItemPrice] = CodecJson.derive[ItemPrice]
  implicit val ItemPriceDecoder: EntityDecoder[ItemPrice] = jsonOf[ItemPrice]
  implicit val ItemPriceEncoder: EntityEncoder[ItemPrice] = jsonEncoderOf[ItemPrice]
}
