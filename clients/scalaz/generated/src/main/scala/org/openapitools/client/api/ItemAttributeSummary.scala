package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemAttributeSummary._

case class ItemAttributeSummary (
  name: String,
url: URI)

object ItemAttributeSummary {
  import DateTimeCodecs._

  implicit val ItemAttributeSummaryCodecJson: CodecJson[ItemAttributeSummary] = CodecJson.derive[ItemAttributeSummary]
  implicit val ItemAttributeSummaryDecoder: EntityDecoder[ItemAttributeSummary] = jsonOf[ItemAttributeSummary]
  implicit val ItemAttributeSummaryEncoder: EntityEncoder[ItemAttributeSummary] = jsonEncoderOf[ItemAttributeSummary]
}
