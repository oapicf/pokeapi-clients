package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonColorDetail._

case class PokemonColorDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[PokemonColorName],
/* A list of the Pokémon species that have this color. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object PokemonColorDetail {
  import DateTimeCodecs._

  implicit val PokemonColorDetailCodecJson: CodecJson[PokemonColorDetail] = CodecJson.derive[PokemonColorDetail]
  implicit val PokemonColorDetailDecoder: EntityDecoder[PokemonColorDetail] = jsonOf[PokemonColorDetail]
  implicit val PokemonColorDetailEncoder: EntityEncoder[PokemonColorDetail] = jsonEncoderOf[PokemonColorDetail]
}
