package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatName._

case class PokeathlonStatName (
  name: String,
language: LanguageSummary)

object PokeathlonStatName {
  import DateTimeCodecs._

  implicit val PokeathlonStatNameCodecJson: CodecJson[PokeathlonStatName] = CodecJson.derive[PokeathlonStatName]
  implicit val PokeathlonStatNameDecoder: EntityDecoder[PokeathlonStatName] = jsonOf[PokeathlonStatName]
  implicit val PokeathlonStatNameEncoder: EntityEncoder[PokeathlonStatName] = jsonEncoderOf[PokeathlonStatName]
}
