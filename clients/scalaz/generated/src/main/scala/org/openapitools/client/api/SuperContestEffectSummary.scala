package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import SuperContestEffectSummary._

case class SuperContestEffectSummary (
  url: URI)

object SuperContestEffectSummary {
  import DateTimeCodecs._

  implicit val SuperContestEffectSummaryCodecJson: CodecJson[SuperContestEffectSummary] = CodecJson.derive[SuperContestEffectSummary]
  implicit val SuperContestEffectSummaryDecoder: EntityDecoder[SuperContestEffectSummary] = jsonOf[SuperContestEffectSummary]
  implicit val SuperContestEffectSummaryEncoder: EntityEncoder[SuperContestEffectSummary] = jsonEncoderOf[SuperContestEffectSummary]
}
