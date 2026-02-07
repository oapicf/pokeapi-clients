package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MachineSummary._

case class MachineSummary (
  url: URI)

object MachineSummary {
  import DateTimeCodecs._

  implicit val MachineSummaryCodecJson: CodecJson[MachineSummary] = CodecJson.derive[MachineSummary]
  implicit val MachineSummaryDecoder: EntityDecoder[MachineSummary] = jsonOf[MachineSummary]
  implicit val MachineSummaryEncoder: EntityEncoder[MachineSummary] = jsonEncoderOf[MachineSummary]
}
