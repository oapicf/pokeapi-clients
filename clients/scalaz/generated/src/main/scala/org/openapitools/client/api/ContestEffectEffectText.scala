package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestEffectEffectText._

case class ContestEffectEffectText (
  effect: String,
language: LanguageSummary)

object ContestEffectEffectText {
  import DateTimeCodecs._

  implicit val ContestEffectEffectTextCodecJson: CodecJson[ContestEffectEffectText] = CodecJson.derive[ContestEffectEffectText]
  implicit val ContestEffectEffectTextDecoder: EntityDecoder[ContestEffectEffectText] = jsonOf[ContestEffectEffectText]
  implicit val ContestEffectEffectTextEncoder: EntityEncoder[ContestEffectEffectText] = jsonEncoderOf[ContestEffectEffectText]
}
