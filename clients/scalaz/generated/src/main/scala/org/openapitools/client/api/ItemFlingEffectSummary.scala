package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ItemFlingEffectSummary._

case class ItemFlingEffectSummary (
  name: String,
url: URI)

object ItemFlingEffectSummary {
  import DateTimeCodecs._

  implicit val ItemFlingEffectSummaryCodecJson: CodecJson[ItemFlingEffectSummary] = CodecJson.derive[ItemFlingEffectSummary]
  implicit val ItemFlingEffectSummaryDecoder: EntityDecoder[ItemFlingEffectSummary] = jsonOf[ItemFlingEffectSummary]
  implicit val ItemFlingEffectSummaryEncoder: EntityEncoder[ItemFlingEffectSummary] = jsonEncoderOf[ItemFlingEffectSummary]
}
