package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import TypeSummary._

case class TypeSummary (
  name: String,
url: URI)

object TypeSummary {
  import DateTimeCodecs._

  implicit val TypeSummaryCodecJson: CodecJson[TypeSummary] = CodecJson.derive[TypeSummary]
  implicit val TypeSummaryDecoder: EntityDecoder[TypeSummary] = jsonOf[TypeSummary]
  implicit val TypeSummaryEncoder: EntityEncoder[TypeSummary] = jsonEncoderOf[TypeSummary]
}
