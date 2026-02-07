package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuperContestEffectFlavorText._

case class SuperContestEffectFlavorText (
  flavorText: String,
language: LanguageSummary)

object SuperContestEffectFlavorText {
  import DateTimeCodecs._

  implicit val SuperContestEffectFlavorTextCodecJson: CodecJson[SuperContestEffectFlavorText] = CodecJson.derive[SuperContestEffectFlavorText]
  implicit val SuperContestEffectFlavorTextDecoder: EntityDecoder[SuperContestEffectFlavorText] = jsonOf[SuperContestEffectFlavorText]
  implicit val SuperContestEffectFlavorTextEncoder: EntityEncoder[SuperContestEffectFlavorText] = jsonEncoderOf[SuperContestEffectFlavorText]
}
