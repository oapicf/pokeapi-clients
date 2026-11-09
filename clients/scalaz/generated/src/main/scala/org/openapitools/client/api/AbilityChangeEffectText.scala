package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityChangeEffectText._

case class AbilityChangeEffectText (
  /* The localized effect text for an API resource in a specific language. */
  effect: String,
/* The language this effect is in. */
  language: LanguageSummary)

object AbilityChangeEffectText {
  import DateTimeCodecs._

  implicit val AbilityChangeEffectTextCodecJson: CodecJson[AbilityChangeEffectText] = CodecJson.derive[AbilityChangeEffectText]
  implicit val AbilityChangeEffectTextDecoder: EntityDecoder[AbilityChangeEffectText] = jsonOf[AbilityChangeEffectText]
  implicit val AbilityChangeEffectTextEncoder: EntityEncoder[AbilityChangeEffectText] = jsonEncoderOf[AbilityChangeEffectText]
}
