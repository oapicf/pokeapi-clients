package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveLearnMethodName._

case class MoveLearnMethodName (
  name: String,
language: LanguageSummary)

object MoveLearnMethodName {
  import DateTimeCodecs._

  implicit val MoveLearnMethodNameCodecJson: CodecJson[MoveLearnMethodName] = CodecJson.derive[MoveLearnMethodName]
  implicit val MoveLearnMethodNameDecoder: EntityDecoder[MoveLearnMethodName] = jsonOf[MoveLearnMethodName]
  implicit val MoveLearnMethodNameEncoder: EntityEncoder[MoveLearnMethodName] = jsonEncoderOf[MoveLearnMethodName]
}
