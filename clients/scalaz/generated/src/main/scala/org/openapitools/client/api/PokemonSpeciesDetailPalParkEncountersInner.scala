package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDetailPalParkEncountersInner._

case class PokemonSpeciesDetailPalParkEncountersInner (
  area: AbilityDetailPokemonInnerPokemon,
baseScore: Integer,
rate: Integer)

object PokemonSpeciesDetailPalParkEncountersInner {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDetailPalParkEncountersInnerCodecJson: CodecJson[PokemonSpeciesDetailPalParkEncountersInner] = CodecJson.derive[PokemonSpeciesDetailPalParkEncountersInner]
  implicit val PokemonSpeciesDetailPalParkEncountersInnerDecoder: EntityDecoder[PokemonSpeciesDetailPalParkEncountersInner] = jsonOf[PokemonSpeciesDetailPalParkEncountersInner]
  implicit val PokemonSpeciesDetailPalParkEncountersInnerEncoder: EntityEncoder[PokemonSpeciesDetailPalParkEncountersInner] = jsonEncoderOf[PokemonSpeciesDetailPalParkEncountersInner]
}
