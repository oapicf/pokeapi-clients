package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexName._

case class PokedexName (
  name: String,
language: LanguageSummary)

object PokedexName {
  import DateTimeCodecs._

  implicit val PokedexNameCodecJson: CodecJson[PokedexName] = CodecJson.derive[PokedexName]
  implicit val PokedexNameDecoder: EntityDecoder[PokedexName] = jsonOf[PokedexName]
  implicit val PokedexNameEncoder: EntityEncoder[PokedexName] = jsonEncoderOf[PokedexName]
}
