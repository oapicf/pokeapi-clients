package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveBattleStyleSummary._

case class MoveBattleStyleSummary (
  name: String,
url: URI)

object MoveBattleStyleSummary {
  import DateTimeCodecs._

  implicit val MoveBattleStyleSummaryCodecJson: CodecJson[MoveBattleStyleSummary] = CodecJson.derive[MoveBattleStyleSummary]
  implicit val MoveBattleStyleSummaryDecoder: EntityDecoder[MoveBattleStyleSummary] = jsonOf[MoveBattleStyleSummary]
  implicit val MoveBattleStyleSummaryEncoder: EntityEncoder[MoveBattleStyleSummary] = jsonEncoderOf[MoveBattleStyleSummary]
}
