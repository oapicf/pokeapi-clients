package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveTargetDescription._

case class MoveTargetDescription (
  description: Option[String],
language: LanguageSummary)

object MoveTargetDescription {
  import DateTimeCodecs._

  implicit val MoveTargetDescriptionCodecJson: CodecJson[MoveTargetDescription] = CodecJson.derive[MoveTargetDescription]
  implicit val MoveTargetDescriptionDecoder: EntityDecoder[MoveTargetDescription] = jsonOf[MoveTargetDescription]
  implicit val MoveTargetDescriptionEncoder: EntityEncoder[MoveTargetDescription] = jsonEncoderOf[MoveTargetDescription]
}
