package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonDetailHeldItems._

case class PokemonDetailHeldItems (
  item: AbilityDetailPokemonInnerPokemon,
versionDetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner])

object PokemonDetailHeldItems {
  import DateTimeCodecs._

  implicit val PokemonDetailHeldItemsCodecJson: CodecJson[PokemonDetailHeldItems] = CodecJson.derive[PokemonDetailHeldItems]
  implicit val PokemonDetailHeldItemsDecoder: EntityDecoder[PokemonDetailHeldItems] = jsonOf[PokemonDetailHeldItems]
  implicit val PokemonDetailHeldItemsEncoder: EntityEncoder[PokemonDetailHeldItems] = jsonEncoderOf[PokemonDetailHeldItems]
}
