package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterMethodName._

case class EncounterMethodName (
  /* The localized name for an API resource in a specific language. */
  name: String,
/* The language this name is in. */
  language: LanguageSummary)

object EncounterMethodName {
  import DateTimeCodecs._

  implicit val EncounterMethodNameCodecJson: CodecJson[EncounterMethodName] = CodecJson.derive[EncounterMethodName]
  implicit val EncounterMethodNameDecoder: EntityDecoder[EncounterMethodName] = jsonOf[EncounterMethodName]
  implicit val EncounterMethodNameEncoder: EntityEncoder[EncounterMethodName] = jsonEncoderOf[EncounterMethodName]
}
