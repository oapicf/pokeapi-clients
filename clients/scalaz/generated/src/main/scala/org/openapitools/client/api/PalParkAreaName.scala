package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalParkAreaName._

case class PalParkAreaName (
  name: String,
language: LanguageSummary)

object PalParkAreaName {
  import DateTimeCodecs._

  implicit val PalParkAreaNameCodecJson: CodecJson[PalParkAreaName] = CodecJson.derive[PalParkAreaName]
  implicit val PalParkAreaNameDecoder: EntityDecoder[PalParkAreaName] = jsonOf[PalParkAreaName]
  implicit val PalParkAreaNameEncoder: EntityEncoder[PalParkAreaName] = jsonEncoderOf[PalParkAreaName]
}
