package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityEffectText._

case class AbilityEffectText (
  /* The localized effect text for an API resource in a specific language. */
  effect: String,
/* The localized effect text in brief. */
  shortEffect: String,
/* The language this effect is in. */
  language: LanguageSummary)

object AbilityEffectText {
  import DateTimeCodecs._

  implicit val AbilityEffectTextCodecJson: CodecJson[AbilityEffectText] = CodecJson.derive[AbilityEffectText]
  implicit val AbilityEffectTextDecoder: EntityDecoder[AbilityEffectText] = jsonOf[AbilityEffectText]
  implicit val AbilityEffectTextEncoder: EntityEncoder[AbilityEffectText] = jsonEncoderOf[AbilityEffectText]
}
