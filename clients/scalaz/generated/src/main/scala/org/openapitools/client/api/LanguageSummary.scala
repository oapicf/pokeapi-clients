package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import LanguageSummary._

case class LanguageSummary (
  name: String,
url: URI)

object LanguageSummary {
  import DateTimeCodecs._

  implicit val LanguageSummaryCodecJson: CodecJson[LanguageSummary] = CodecJson.derive[LanguageSummary]
  implicit val LanguageSummaryDecoder: EntityDecoder[LanguageSummary] = jsonOf[LanguageSummary]
  implicit val LanguageSummaryEncoder: EntityEncoder[LanguageSummary] = jsonEncoderOf[LanguageSummary]
}
