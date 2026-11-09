package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import ContestTypeSummary._

case class ContestTypeSummary (
  /* The name of the referenced resource. */
  name: String,
/* The URL of the referenced resource. */
  url: URI)

object ContestTypeSummary {
  import DateTimeCodecs._

  implicit val ContestTypeSummaryCodecJson: CodecJson[ContestTypeSummary] = CodecJson.derive[ContestTypeSummary]
  implicit val ContestTypeSummaryDecoder: EntityDecoder[ContestTypeSummary] = jsonOf[ContestTypeSummary]
  implicit val ContestTypeSummaryEncoder: EntityEncoder[ContestTypeSummary] = jsonEncoderOf[ContestTypeSummary]
}
