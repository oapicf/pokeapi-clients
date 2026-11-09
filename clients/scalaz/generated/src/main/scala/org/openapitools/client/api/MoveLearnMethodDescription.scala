package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveLearnMethodDescription._

case class MoveLearnMethodDescription (
  /* The localized description for an API resource in a specific language. */
  description: Option[String],
/* The language this name is in. */
  language: LanguageSummary)

object MoveLearnMethodDescription {
  import DateTimeCodecs._

  implicit val MoveLearnMethodDescriptionCodecJson: CodecJson[MoveLearnMethodDescription] = CodecJson.derive[MoveLearnMethodDescription]
  implicit val MoveLearnMethodDescriptionDecoder: EntityDecoder[MoveLearnMethodDescription] = jsonOf[MoveLearnMethodDescription]
  implicit val MoveLearnMethodDescriptionEncoder: EntityEncoder[MoveLearnMethodDescription] = jsonEncoderOf[MoveLearnMethodDescription]
}
