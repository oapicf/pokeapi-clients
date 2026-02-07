package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemPocketSummary._

case class ItemPocketSummary (
  name: String,
url: URI)

object ItemPocketSummary {
  import DateTimeCodecs._

  implicit val ItemPocketSummaryCodecJson: CodecJson[ItemPocketSummary] = CodecJson.derive[ItemPocketSummary]
  implicit val ItemPocketSummaryDecoder: EntityDecoder[ItemPocketSummary] = jsonOf[ItemPocketSummary]
  implicit val ItemPocketSummaryEncoder: EntityEncoder[ItemPocketSummary] = jsonEncoderOf[ItemPocketSummary]
}
