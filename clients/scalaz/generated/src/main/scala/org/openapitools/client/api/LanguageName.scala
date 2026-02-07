package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LanguageName._

case class LanguageName (
  name: String,
language: LanguageSummary)

object LanguageName {
  import DateTimeCodecs._

  implicit val LanguageNameCodecJson: CodecJson[LanguageName] = CodecJson.derive[LanguageName]
  implicit val LanguageNameDecoder: EntityDecoder[LanguageName] = jsonOf[LanguageName]
  implicit val LanguageNameEncoder: EntityEncoder[LanguageName] = jsonEncoderOf[LanguageName]
}
