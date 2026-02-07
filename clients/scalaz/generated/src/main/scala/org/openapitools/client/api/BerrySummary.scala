package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import BerrySummary._

case class BerrySummary (
  name: String,
url: URI)

object BerrySummary {
  import DateTimeCodecs._

  implicit val BerrySummaryCodecJson: CodecJson[BerrySummary] = CodecJson.derive[BerrySummary]
  implicit val BerrySummaryDecoder: EntityDecoder[BerrySummary] = jsonOf[BerrySummary]
  implicit val BerrySummaryEncoder: EntityEncoder[BerrySummary] = jsonEncoderOf[BerrySummary]
}
