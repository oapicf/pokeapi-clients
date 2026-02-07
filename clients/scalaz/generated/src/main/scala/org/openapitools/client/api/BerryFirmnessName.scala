package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFirmnessName._

case class BerryFirmnessName (
  name: String,
language: LanguageSummary)

object BerryFirmnessName {
  import DateTimeCodecs._

  implicit val BerryFirmnessNameCodecJson: CodecJson[BerryFirmnessName] = CodecJson.derive[BerryFirmnessName]
  implicit val BerryFirmnessNameDecoder: EntityDecoder[BerryFirmnessName] = jsonOf[BerryFirmnessName]
  implicit val BerryFirmnessNameEncoder: EntityEncoder[BerryFirmnessName] = jsonEncoderOf[BerryFirmnessName]
}
