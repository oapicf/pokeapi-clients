package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalParkAreaDetailPokemonEncountersInner._

case class PalParkAreaDetailPokemonEncountersInner (
  baseScore: Integer,
pokemonSpecies: AbilityDetailPokemonInnerPokemon,
rate: Integer)

object PalParkAreaDetailPokemonEncountersInner {
  import DateTimeCodecs._

  implicit val PalParkAreaDetailPokemonEncountersInnerCodecJson: CodecJson[PalParkAreaDetailPokemonEncountersInner] = CodecJson.derive[PalParkAreaDetailPokemonEncountersInner]
  implicit val PalParkAreaDetailPokemonEncountersInnerDecoder: EntityDecoder[PalParkAreaDetailPokemonEncountersInner] = jsonOf[PalParkAreaDetailPokemonEncountersInner]
  implicit val PalParkAreaDetailPokemonEncountersInnerEncoder: EntityEncoder[PalParkAreaDetailPokemonEncountersInner] = jsonEncoderOf[PalParkAreaDetailPokemonEncountersInner]
}
