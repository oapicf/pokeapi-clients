package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ContestEffectSummary._

case class ContestEffectSummary (
  url: URI)

object ContestEffectSummary {
  import DateTimeCodecs._

  implicit val ContestEffectSummaryCodecJson: CodecJson[ContestEffectSummary] = CodecJson.derive[ContestEffectSummary]
  implicit val ContestEffectSummaryDecoder: EntityDecoder[ContestEffectSummary] = jsonOf[ContestEffectSummary]
  implicit val ContestEffectSummaryEncoder: EntityEncoder[ContestEffectSummary] = jsonEncoderOf[ContestEffectSummary]
}
