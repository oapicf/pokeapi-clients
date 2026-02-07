package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import NatureSummary._

case class NatureSummary (
  name: String,
url: URI)

object NatureSummary {
  import DateTimeCodecs._

  implicit val NatureSummaryCodecJson: CodecJson[NatureSummary] = CodecJson.derive[NatureSummary]
  implicit val NatureSummaryDecoder: EntityDecoder[NatureSummary] = jsonOf[NatureSummary]
  implicit val NatureSummaryEncoder: EntityEncoder[NatureSummary] = jsonEncoderOf[NatureSummary]
}
