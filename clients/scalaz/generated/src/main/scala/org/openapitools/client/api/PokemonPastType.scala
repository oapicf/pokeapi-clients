package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonPastType._

case class PokemonPastType (
  /* The last generation in which the referenced pokémon had the listed types. */
  generation: GenerationSummary,
/* The types the referenced pokémon had up to and including the listed generation. */
  types: List[PokemonType])

object PokemonPastType {
  import DateTimeCodecs._

  implicit val PokemonPastTypeCodecJson: CodecJson[PokemonPastType] = CodecJson.derive[PokemonPastType]
  implicit val PokemonPastTypeDecoder: EntityDecoder[PokemonPastType] = jsonOf[PokemonPastType]
  implicit val PokemonPastTypeEncoder: EntityEncoder[PokemonPastType] = jsonEncoderOf[PokemonPastType]
}
