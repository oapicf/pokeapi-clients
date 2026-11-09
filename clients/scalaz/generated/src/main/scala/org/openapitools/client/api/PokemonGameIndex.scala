package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonGameIndex._

case class PokemonGameIndex (
  /* The internal id of an API resource within game data. */
  gameIndex: Integer,
/* The version relevent to this game index. */
  version: VersionSummary)

object PokemonGameIndex {
  import DateTimeCodecs._

  implicit val PokemonGameIndexCodecJson: CodecJson[PokemonGameIndex] = CodecJson.derive[PokemonGameIndex]
  implicit val PokemonGameIndexDecoder: EntityDecoder[PokemonGameIndex] = jsonOf[PokemonGameIndex]
  implicit val PokemonGameIndexEncoder: EntityEncoder[PokemonGameIndex] = jsonEncoderOf[PokemonGameIndex]
}
