package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityEffectText._

case class AbilityEffectText (
  effect: String,
shortEffect: String,
language: LanguageSummary)

object AbilityEffectText {
  import DateTimeCodecs._

  implicit val AbilityEffectTextCodecJson: CodecJson[AbilityEffectText] = CodecJson.derive[AbilityEffectText]
  implicit val AbilityEffectTextDecoder: EntityDecoder[AbilityEffectText] = jsonOf[AbilityEffectText]
  implicit val AbilityEffectTextEncoder: EntityEncoder[AbilityEffectText] = jsonEncoderOf[AbilityEffectText]
}
