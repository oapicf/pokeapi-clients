package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveName._

case class MoveName (
  name: String,
language: LanguageSummary)

object MoveName {
  import DateTimeCodecs._

  implicit val MoveNameCodecJson: CodecJson[MoveName] = CodecJson.derive[MoveName]
  implicit val MoveNameDecoder: EntityDecoder[MoveName] = jsonOf[MoveName]
  implicit val MoveNameEncoder: EntityEncoder[MoveName] = jsonEncoderOf[MoveName]
}
