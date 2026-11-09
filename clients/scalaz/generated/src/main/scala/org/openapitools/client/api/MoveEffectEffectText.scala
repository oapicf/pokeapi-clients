package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveEffectEffectText._

case class MoveEffectEffectText (
  /* The localized effect text for an API resource in a specific language. */
  effect: String,
/* The localized effect text in brief. */
  shortEffect: String,
/* The language this effect is in. */
  language: LanguageSummary)

object MoveEffectEffectText {
  import DateTimeCodecs._

  implicit val MoveEffectEffectTextCodecJson: CodecJson[MoveEffectEffectText] = CodecJson.derive[MoveEffectEffectText]
  implicit val MoveEffectEffectTextDecoder: EntityDecoder[MoveEffectEffectText] = jsonOf[MoveEffectEffectText]
  implicit val MoveEffectEffectTextEncoder: EntityEncoder[MoveEffectEffectText] = jsonEncoderOf[MoveEffectEffectText]
}
