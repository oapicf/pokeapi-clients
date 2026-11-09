package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesVariety._

case class PokemonSpeciesVariety (
  /* Whether this variety is the default variety. */
  isDefault: Boolean,
/* The Pokémon variety. */
  pokemon: PokemonSummary)

object PokemonSpeciesVariety {
  import DateTimeCodecs._

  implicit val PokemonSpeciesVarietyCodecJson: CodecJson[PokemonSpeciesVariety] = CodecJson.derive[PokemonSpeciesVariety]
  implicit val PokemonSpeciesVarietyDecoder: EntityDecoder[PokemonSpeciesVariety] = jsonOf[PokemonSpeciesVariety]
  implicit val PokemonSpeciesVarietyEncoder: EntityEncoder[PokemonSpeciesVariety] = jsonEncoderOf[PokemonSpeciesVariety]
}
