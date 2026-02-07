package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionName._

case class VersionName (
  name: String,
language: LanguageSummary)

object VersionName {
  import DateTimeCodecs._

  implicit val VersionNameCodecJson: CodecJson[VersionName] = CodecJson.derive[VersionName]
  implicit val VersionNameDecoder: EntityDecoder[VersionName] = jsonOf[VersionName]
  implicit val VersionNameEncoder: EntityEncoder[VersionName] = jsonEncoderOf[VersionName]
}
