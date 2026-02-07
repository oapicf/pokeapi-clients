package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestEffectFlavorText._

case class ContestEffectFlavorText (
  flavorText: String,
language: LanguageSummary)

object ContestEffectFlavorText {
  import DateTimeCodecs._

  implicit val ContestEffectFlavorTextCodecJson: CodecJson[ContestEffectFlavorText] = CodecJson.derive[ContestEffectFlavorText]
  implicit val ContestEffectFlavorTextDecoder: EntityDecoder[ContestEffectFlavorText] = jsonOf[ContestEffectFlavorText]
  implicit val ContestEffectFlavorTextEncoder: EntityEncoder[ContestEffectFlavorText] = jsonEncoderOf[ContestEffectFlavorText]
}
