package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import CharacteristicSummary._

case class CharacteristicSummary (
  url: URI)

object CharacteristicSummary {
  import DateTimeCodecs._

  implicit val CharacteristicSummaryCodecJson: CodecJson[CharacteristicSummary] = CodecJson.derive[CharacteristicSummary]
  implicit val CharacteristicSummaryDecoder: EntityDecoder[CharacteristicSummary] = jsonOf[CharacteristicSummary]
  implicit val CharacteristicSummaryEncoder: EntityEncoder[CharacteristicSummary] = jsonEncoderOf[CharacteristicSummary]
}
