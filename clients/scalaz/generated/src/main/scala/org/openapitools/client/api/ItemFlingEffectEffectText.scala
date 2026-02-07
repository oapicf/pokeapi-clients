package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemFlingEffectEffectText._

case class ItemFlingEffectEffectText (
  effect: String,
language: LanguageSummary)

object ItemFlingEffectEffectText {
  import DateTimeCodecs._

  implicit val ItemFlingEffectEffectTextCodecJson: CodecJson[ItemFlingEffectEffectText] = CodecJson.derive[ItemFlingEffectEffectText]
  implicit val ItemFlingEffectEffectTextDecoder: EntityDecoder[ItemFlingEffectEffectText] = jsonOf[ItemFlingEffectEffectText]
  implicit val ItemFlingEffectEffectTextEncoder: EntityEncoder[ItemFlingEffectEffectText] = jsonEncoderOf[ItemFlingEffectEffectText]
}
