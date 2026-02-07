package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesDetailVarietiesInner._

case class PokemonSpeciesDetailVarietiesInner (
  isDefault: Boolean,
pokemon: AbilityDetailPokemonInnerPokemon)

object PokemonSpeciesDetailVarietiesInner {
  import DateTimeCodecs._

  implicit val PokemonSpeciesDetailVarietiesInnerCodecJson: CodecJson[PokemonSpeciesDetailVarietiesInner] = CodecJson.derive[PokemonSpeciesDetailVarietiesInner]
  implicit val PokemonSpeciesDetailVarietiesInnerDecoder: EntityDecoder[PokemonSpeciesDetailVarietiesInner] = jsonOf[PokemonSpeciesDetailVarietiesInner]
  implicit val PokemonSpeciesDetailVarietiesInnerEncoder: EntityEncoder[PokemonSpeciesDetailVarietiesInner] = jsonEncoderOf[PokemonSpeciesDetailVarietiesInner]
}
