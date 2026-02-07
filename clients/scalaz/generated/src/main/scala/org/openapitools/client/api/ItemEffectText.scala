package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemEffectText._

case class ItemEffectText (
  effect: String,
shortEffect: String,
language: LanguageSummary)

object ItemEffectText {
  import DateTimeCodecs._

  implicit val ItemEffectTextCodecJson: CodecJson[ItemEffectText] = CodecJson.derive[ItemEffectText]
  implicit val ItemEffectTextDecoder: EntityDecoder[ItemEffectText] = jsonOf[ItemEffectText]
  implicit val ItemEffectTextEncoder: EntityEncoder[ItemEffectText] = jsonEncoderOf[ItemEffectText]
}
