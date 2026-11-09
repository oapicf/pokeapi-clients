package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemEffectText._

case class ItemEffectText (
  /* The localized effect text for an API resource in a specific language. */
  effect: String,
/* The localized effect text in brief. */
  shortEffect: String,
/* The language this effect is in. */
  language: LanguageSummary)

object ItemEffectText {
  import DateTimeCodecs._

  implicit val ItemEffectTextCodecJson: CodecJson[ItemEffectText] = CodecJson.derive[ItemEffectText]
  implicit val ItemEffectTextDecoder: EntityDecoder[ItemEffectText] = jsonOf[ItemEffectText]
  implicit val ItemEffectTextEncoder: EntityEncoder[ItemEffectText] = jsonEncoderOf[ItemEffectText]
}
