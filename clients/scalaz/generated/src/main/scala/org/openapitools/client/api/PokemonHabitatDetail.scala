package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHabitatDetail._

case class PokemonHabitatDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[PokemonHabitatName],
/* A list of the Pokémon species that can be found in this habitat. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object PokemonHabitatDetail {
  import DateTimeCodecs._

  implicit val PokemonHabitatDetailCodecJson: CodecJson[PokemonHabitatDetail] = CodecJson.derive[PokemonHabitatDetail]
  implicit val PokemonHabitatDetailDecoder: EntityDecoder[PokemonHabitatDetail] = jsonOf[PokemonHabitatDetail]
  implicit val PokemonHabitatDetailEncoder: EntityEncoder[PokemonHabitatDetail] = jsonEncoderOf[PokemonHabitatDetail]
}
