package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHabitatDetail._

case class PokemonHabitatDetail (
  id: Integer,
name: String,
names: List[PokemonHabitatName],
pokemonSpecies: List[PokemonSpeciesSummary])

object PokemonHabitatDetail {
  import DateTimeCodecs._

  implicit val PokemonHabitatDetailCodecJson: CodecJson[PokemonHabitatDetail] = CodecJson.derive[PokemonHabitatDetail]
  implicit val PokemonHabitatDetailDecoder: EntityDecoder[PokemonHabitatDetail] = jsonOf[PokemonHabitatDetail]
  implicit val PokemonHabitatDetailEncoder: EntityEncoder[PokemonHabitatDetail] = jsonEncoderOf[PokemonHabitatDetail]
}
