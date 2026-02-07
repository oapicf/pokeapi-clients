package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorName._

case class BerryFlavorName (
  name: String,
language: LanguageSummary)

object BerryFlavorName {
  import DateTimeCodecs._

  implicit val BerryFlavorNameCodecJson: CodecJson[BerryFlavorName] = CodecJson.derive[BerryFlavorName]
  implicit val BerryFlavorNameDecoder: EntityDecoder[BerryFlavorName] = jsonOf[BerryFlavorName]
  implicit val BerryFlavorNameEncoder: EntityEncoder[BerryFlavorName] = jsonEncoderOf[BerryFlavorName]
}
