package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemCategorySummary._

case class ItemCategorySummary (
  name: String,
url: URI)

object ItemCategorySummary {
  import DateTimeCodecs._

  implicit val ItemCategorySummaryCodecJson: CodecJson[ItemCategorySummary] = CodecJson.derive[ItemCategorySummary]
  implicit val ItemCategorySummaryDecoder: EntityDecoder[ItemCategorySummary] = jsonOf[ItemCategorySummary]
  implicit val ItemCategorySummaryEncoder: EntityEncoder[ItemCategorySummary] = jsonEncoderOf[ItemCategorySummary]
}
