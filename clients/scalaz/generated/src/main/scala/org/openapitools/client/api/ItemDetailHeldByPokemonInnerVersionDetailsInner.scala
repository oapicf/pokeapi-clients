package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDetailHeldByPokemonInnerVersionDetailsInner._

case class ItemDetailHeldByPokemonInnerVersionDetailsInner (
  rarity: Integer,
version: AbilityDetailPokemonInnerPokemon)

object ItemDetailHeldByPokemonInnerVersionDetailsInner {
  import DateTimeCodecs._

  implicit val ItemDetailHeldByPokemonInnerVersionDetailsInnerCodecJson: CodecJson[ItemDetailHeldByPokemonInnerVersionDetailsInner] = CodecJson.derive[ItemDetailHeldByPokemonInnerVersionDetailsInner]
  implicit val ItemDetailHeldByPokemonInnerVersionDetailsInnerDecoder: EntityDecoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = jsonOf[ItemDetailHeldByPokemonInnerVersionDetailsInner]
  implicit val ItemDetailHeldByPokemonInnerVersionDetailsInnerEncoder: EntityEncoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = jsonEncoderOf[ItemDetailHeldByPokemonInnerVersionDetailsInner]
}
