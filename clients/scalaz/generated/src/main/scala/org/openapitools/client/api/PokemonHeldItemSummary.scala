package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonHeldItemSummary._

case class PokemonHeldItemSummary (
  /* The item the referenced Pokémon holds. */
  item: ItemSummary,
/* The details of the different versions in which the item is held. */
  versionDetails: List[PokemonHeldItemVersion])

object PokemonHeldItemSummary {
  import DateTimeCodecs._

  implicit val PokemonHeldItemSummaryCodecJson: CodecJson[PokemonHeldItemSummary] = CodecJson.derive[PokemonHeldItemSummary]
  implicit val PokemonHeldItemSummaryDecoder: EntityDecoder[PokemonHeldItemSummary] = jsonOf[PokemonHeldItemSummary]
  implicit val PokemonHeldItemSummaryEncoder: EntityEncoder[PokemonHeldItemSummary] = jsonEncoderOf[PokemonHeldItemSummary]
}
