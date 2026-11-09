package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveEffectChangeEffectText._

case class MoveEffectChangeEffectText (
  /* The localized effect text for an API resource in a specific language. */
  effect: String,
/* The language this effect is in. */
  language: LanguageSummary)

object MoveEffectChangeEffectText {
  import DateTimeCodecs._

  implicit val MoveEffectChangeEffectTextCodecJson: CodecJson[MoveEffectChangeEffectText] = CodecJson.derive[MoveEffectChangeEffectText]
  implicit val MoveEffectChangeEffectTextDecoder: EntityDecoder[MoveEffectChangeEffectText] = jsonOf[MoveEffectChangeEffectText]
  implicit val MoveEffectChangeEffectTextEncoder: EntityEncoder[MoveEffectChangeEffectText] = jsonEncoderOf[MoveEffectChangeEffectText]
}
