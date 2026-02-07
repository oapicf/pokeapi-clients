package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveMetaAilmentSummary._

case class MoveMetaAilmentSummary (
  name: String,
url: URI)

object MoveMetaAilmentSummary {
  import DateTimeCodecs._

  implicit val MoveMetaAilmentSummaryCodecJson: CodecJson[MoveMetaAilmentSummary] = CodecJson.derive[MoveMetaAilmentSummary]
  implicit val MoveMetaAilmentSummaryDecoder: EntityDecoder[MoveMetaAilmentSummary] = jsonOf[MoveMetaAilmentSummary]
  implicit val MoveMetaAilmentSummaryEncoder: EntityEncoder[MoveMetaAilmentSummary] = jsonEncoderOf[MoveMetaAilmentSummary]
}
