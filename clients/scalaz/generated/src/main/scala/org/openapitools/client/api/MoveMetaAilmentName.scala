package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaAilmentName._

case class MoveMetaAilmentName (
  name: String,
language: LanguageSummary)

object MoveMetaAilmentName {
  import DateTimeCodecs._

  implicit val MoveMetaAilmentNameCodecJson: CodecJson[MoveMetaAilmentName] = CodecJson.derive[MoveMetaAilmentName]
  implicit val MoveMetaAilmentNameDecoder: EntityDecoder[MoveMetaAilmentName] = jsonOf[MoveMetaAilmentName]
  implicit val MoveMetaAilmentNameEncoder: EntityEncoder[MoveMetaAilmentName] = jsonEncoderOf[MoveMetaAilmentName]
}
