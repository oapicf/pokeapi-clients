package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHeldItem._

case class PokemonHeldItem (
  /* The Pokémon that holds this item. */
  pokemon: PokemonSummary,
/* The details for the version that this item is held in by the Pokémon. */
  versionDetails: List[PokemonHeldItemVersion])

object PokemonHeldItem {
  import DateTimeCodecs._

  implicit val PokemonHeldItemCodecJson: CodecJson[PokemonHeldItem] = CodecJson.derive[PokemonHeldItem]
  implicit val PokemonHeldItemDecoder: EntityDecoder[PokemonHeldItem] = jsonOf[PokemonHeldItem]
  implicit val PokemonHeldItemEncoder: EntityEncoder[PokemonHeldItem] = jsonEncoderOf[PokemonHeldItem]
}
