package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDetailGeneraInner._

case class PokemonSpeciesDetailGeneraInner (
  genus: String,
language: AbilityDetailPokemonInnerPokemon)

object PokemonSpeciesDetailGeneraInner {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDetailGeneraInnerCodecJson: CodecJson[PokemonSpeciesDetailGeneraInner] = CodecJson.derive[PokemonSpeciesDetailGeneraInner]
  implicit val PokemonSpeciesDetailGeneraInnerDecoder: EntityDecoder[PokemonSpeciesDetailGeneraInner] = jsonOf[PokemonSpeciesDetailGeneraInner]
  implicit val PokemonSpeciesDetailGeneraInnerEncoder: EntityEncoder[PokemonSpeciesDetailGeneraInner] = jsonEncoderOf[PokemonSpeciesDetailGeneraInner]
}
