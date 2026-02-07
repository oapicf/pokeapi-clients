package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EggGroupName._

case class EggGroupName (
  name: String,
language: LanguageSummary)

object EggGroupName {
  import DateTimeCodecs._

  implicit val EggGroupNameCodecJson: CodecJson[EggGroupName] = CodecJson.derive[EggGroupName]
  implicit val EggGroupNameDecoder: EntityDecoder[EggGroupName] = jsonOf[EggGroupName]
  implicit val EggGroupNameEncoder: EntityEncoder[EggGroupName] = jsonEncoderOf[EggGroupName]
}
