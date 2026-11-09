package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CurrencyName._

case class CurrencyName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object CurrencyName {
  import DateTimeCodecs._

  implicit val CurrencyNameCodecJson: CodecJson[CurrencyName] = CodecJson.derive[CurrencyName]
  implicit val CurrencyNameDecoder: EntityDecoder[CurrencyName] = jsonOf[CurrencyName]
  implicit val CurrencyNameEncoder: EntityEncoder[CurrencyName] = jsonEncoderOf[CurrencyName]
}
