package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemDetailHeldByPokemonInner._

case class ItemDetailHeldByPokemonInner (
  pokemon: AbilityDetailPokemonInnerPokemon,
versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner])

object ItemDetailHeldByPokemonInner {
  import DateTimeCodecs._

  implicit val ItemDetailHeldByPokemonInnerCodecJson: CodecJson[ItemDetailHeldByPokemonInner] = CodecJson.derive[ItemDetailHeldByPokemonInner]
  implicit val ItemDetailHeldByPokemonInnerDecoder: EntityDecoder[ItemDetailHeldByPokemonInner] = jsonOf[ItemDetailHeldByPokemonInner]
  implicit val ItemDetailHeldByPokemonInnerEncoder: EntityEncoder[ItemDetailHeldByPokemonInner] = jsonEncoderOf[ItemDetailHeldByPokemonInner]
}
