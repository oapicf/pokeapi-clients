package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonPastStat._

case class PokemonPastStat (
  /* The last generation in which the referenced pokémon had the listed stats. */
  generation: GenerationSummary,
/* The stat the Pokémon had up to and including the listed generation. */
  stats: List[PokemonStat])

object PokemonPastStat {
  import DateTimeCodecs._

  implicit val PokemonPastStatCodecJson: CodecJson[PokemonPastStat] = CodecJson.derive[PokemonPastStat]
  implicit val PokemonPastStatDecoder: EntityDecoder[PokemonPastStat] = jsonOf[PokemonPastStat]
  implicit val PokemonPastStatEncoder: EntityEncoder[PokemonPastStat] = jsonEncoderOf[PokemonPastStat]
}
