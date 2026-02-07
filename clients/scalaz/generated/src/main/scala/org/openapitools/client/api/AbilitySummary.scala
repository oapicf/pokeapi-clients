package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import AbilitySummary._

case class AbilitySummary (
  name: String,
url: URI)

object AbilitySummary {
  import DateTimeCodecs._

  implicit val AbilitySummaryCodecJson: CodecJson[AbilitySummary] = CodecJson.derive[AbilitySummary]
  implicit val AbilitySummaryDecoder: EntityDecoder[AbilitySummary] = jsonOf[AbilitySummary]
  implicit val AbilitySummaryEncoder: EntityEncoder[AbilitySummary] = jsonEncoderOf[AbilitySummary]
}
