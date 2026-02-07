package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveLearnMethodDescription._

case class MoveLearnMethodDescription (
  description: Option[String],
language: LanguageSummary)

object MoveLearnMethodDescription {
  import DateTimeCodecs._

  implicit val MoveLearnMethodDescriptionCodecJson: CodecJson[MoveLearnMethodDescription] = CodecJson.derive[MoveLearnMethodDescription]
  implicit val MoveLearnMethodDescriptionDecoder: EntityDecoder[MoveLearnMethodDescription] = jsonOf[MoveLearnMethodDescription]
  implicit val MoveLearnMethodDescriptionEncoder: EntityEncoder[MoveLearnMethodDescription] = jsonEncoderOf[MoveLearnMethodDescription]
}
