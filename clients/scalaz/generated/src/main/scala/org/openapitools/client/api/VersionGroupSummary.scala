package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import VersionGroupSummary._

case class VersionGroupSummary (
  name: String,
url: URI)

object VersionGroupSummary {
  import DateTimeCodecs._

  implicit val VersionGroupSummaryCodecJson: CodecJson[VersionGroupSummary] = CodecJson.derive[VersionGroupSummary]
  implicit val VersionGroupSummaryDecoder: EntityDecoder[VersionGroupSummary] = jsonOf[VersionGroupSummary]
  implicit val VersionGroupSummaryEncoder: EntityEncoder[VersionGroupSummary] = jsonEncoderOf[VersionGroupSummary]
}
