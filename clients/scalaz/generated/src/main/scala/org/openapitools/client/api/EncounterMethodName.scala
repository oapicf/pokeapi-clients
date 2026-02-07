package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterMethodName._

case class EncounterMethodName (
  name: String,
language: LanguageSummary)

object EncounterMethodName {
  import DateTimeCodecs._

  implicit val EncounterMethodNameCodecJson: CodecJson[EncounterMethodName] = CodecJson.derive[EncounterMethodName]
  implicit val EncounterMethodNameDecoder: EntityDecoder[EncounterMethodName] = jsonOf[EncounterMethodName]
  implicit val EncounterMethodNameEncoder: EntityEncoder[EncounterMethodName] = jsonEncoderOf[EncounterMethodName]
}
