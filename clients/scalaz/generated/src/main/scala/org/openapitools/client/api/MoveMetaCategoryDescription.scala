package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaCategoryDescription._

case class MoveMetaCategoryDescription (
  description: Option[String],
language: LanguageSummary)

object MoveMetaCategoryDescription {
  import DateTimeCodecs._

  implicit val MoveMetaCategoryDescriptionCodecJson: CodecJson[MoveMetaCategoryDescription] = CodecJson.derive[MoveMetaCategoryDescription]
  implicit val MoveMetaCategoryDescriptionDecoder: EntityDecoder[MoveMetaCategoryDescription] = jsonOf[MoveMetaCategoryDescription]
  implicit val MoveMetaCategoryDescriptionEncoder: EntityEncoder[MoveMetaCategoryDescription] = jsonEncoderOf[MoveMetaCategoryDescription]
}
