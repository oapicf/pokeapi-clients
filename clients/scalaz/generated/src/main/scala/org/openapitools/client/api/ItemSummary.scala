package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemSummary._

case class ItemSummary (
  name: String,
url: URI)

object ItemSummary {
  import DateTimeCodecs._

  implicit val ItemSummaryCodecJson: CodecJson[ItemSummary] = CodecJson.derive[ItemSummary]
  implicit val ItemSummaryDecoder: EntityDecoder[ItemSummary] = jsonOf[ItemSummary]
  implicit val ItemSummaryEncoder: EntityEncoder[ItemSummary] = jsonEncoderOf[ItemSummary]
}
