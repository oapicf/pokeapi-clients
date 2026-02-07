package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestTypeName._

case class ContestTypeName (
  name: String,
color: String,
language: LanguageSummary)

object ContestTypeName {
  import DateTimeCodecs._

  implicit val ContestTypeNameCodecJson: CodecJson[ContestTypeName] = CodecJson.derive[ContestTypeName]
  implicit val ContestTypeNameDecoder: EntityDecoder[ContestTypeName] = jsonOf[ContestTypeName]
  implicit val ContestTypeNameEncoder: EntityEncoder[ContestTypeName] = jsonEncoderOf[ContestTypeName]
}
