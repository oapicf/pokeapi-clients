package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveDamageClassSummary._

case class MoveDamageClassSummary (
  name: String,
url: URI)

object MoveDamageClassSummary {
  import DateTimeCodecs._

  implicit val MoveDamageClassSummaryCodecJson: CodecJson[MoveDamageClassSummary] = CodecJson.derive[MoveDamageClassSummary]
  implicit val MoveDamageClassSummaryDecoder: EntityDecoder[MoveDamageClassSummary] = jsonOf[MoveDamageClassSummary]
  implicit val MoveDamageClassSummaryEncoder: EntityEncoder[MoveDamageClassSummary] = jsonEncoderOf[MoveDamageClassSummary]
}
