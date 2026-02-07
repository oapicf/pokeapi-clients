package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import GenerationSummary._

case class GenerationSummary (
  name: String,
url: URI)

object GenerationSummary {
  import DateTimeCodecs._

  implicit val GenerationSummaryCodecJson: CodecJson[GenerationSummary] = CodecJson.derive[GenerationSummary]
  implicit val GenerationSummaryDecoder: EntityDecoder[GenerationSummary] = jsonOf[GenerationSummary]
  implicit val GenerationSummaryEncoder: EntityEncoder[GenerationSummary] = jsonEncoderOf[GenerationSummary]
}
