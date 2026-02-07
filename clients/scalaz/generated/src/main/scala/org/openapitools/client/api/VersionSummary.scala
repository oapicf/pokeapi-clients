package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import VersionSummary._

case class VersionSummary (
  name: String,
url: URI)

object VersionSummary {
  import DateTimeCodecs._

  implicit val VersionSummaryCodecJson: CodecJson[VersionSummary] = CodecJson.derive[VersionSummary]
  implicit val VersionSummaryDecoder: EntityDecoder[VersionSummary] = jsonOf[VersionSummary]
  implicit val VersionSummaryEncoder: EntityEncoder[VersionSummary] = jsonEncoderOf[VersionSummary]
}
