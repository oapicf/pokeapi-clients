package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonType._

case class PokemonType (
  /* The order the Pokémon's types are listed in. */
  slot: Integer,
/* The type the referenced Pokémon has. */
  `type`: TypeSummary)

object PokemonType {
  import DateTimeCodecs._

  implicit val PokemonTypeCodecJson: CodecJson[PokemonType] = CodecJson.derive[PokemonType]
  implicit val PokemonTypeDecoder: EntityDecoder[PokemonType] = jsonOf[PokemonType]
  implicit val PokemonTypeEncoder: EntityEncoder[PokemonType] = jsonEncoderOf[PokemonType]
}
