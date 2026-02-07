package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexDetailPokemonEntriesInner._

case class PokedexDetailPokemonEntriesInner (
  entryNumber: Integer,
pokemonSpecies: AbilityDetailPokemonInnerPokemon)

object PokedexDetailPokemonEntriesInner {
  import DateTimeCodecs._

  implicit val PokedexDetailPokemonEntriesInnerCodecJson: CodecJson[PokedexDetailPokemonEntriesInner] = CodecJson.derive[PokedexDetailPokemonEntriesInner]
  implicit val PokedexDetailPokemonEntriesInnerDecoder: EntityDecoder[PokedexDetailPokemonEntriesInner] = jsonOf[PokedexDetailPokemonEntriesInner]
  implicit val PokedexDetailPokemonEntriesInnerEncoder: EntityEncoder[PokedexDetailPokemonEntriesInner] = jsonEncoderOf[PokedexDetailPokemonEntriesInner]
}
