package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import StatSummary._

case class StatSummary (
  name: String,
url: URI)

object StatSummary {
  import DateTimeCodecs._

  implicit val StatSummaryCodecJson: CodecJson[StatSummary] = CodecJson.derive[StatSummary]
  implicit val StatSummaryDecoder: EntityDecoder[StatSummary] = jsonOf[StatSummary]
  implicit val StatSummaryEncoder: EntityEncoder[StatSummary] = jsonEncoderOf[StatSummary]
}
