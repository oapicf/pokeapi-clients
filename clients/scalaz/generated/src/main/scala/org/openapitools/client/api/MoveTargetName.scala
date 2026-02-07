package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveTargetName._

case class MoveTargetName (
  name: String,
language: LanguageSummary)

object MoveTargetName {
  import DateTimeCodecs._

  implicit val MoveTargetNameCodecJson: CodecJson[MoveTargetName] = CodecJson.derive[MoveTargetName]
  implicit val MoveTargetNameDecoder: EntityDecoder[MoveTargetName] = jsonOf[MoveTargetName]
  implicit val MoveTargetNameEncoder: EntityEncoder[MoveTargetName] = jsonEncoderOf[MoveTargetName]
}
