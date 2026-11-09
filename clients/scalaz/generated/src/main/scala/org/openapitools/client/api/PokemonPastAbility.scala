package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonPastAbility._

case class PokemonPastAbility (
  /* The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. */
  abilities: List[PokemonAbilityPast],
/* The last generation in which the referenced pokémon had the listed abilities. */
  generation: GenerationSummary)

object PokemonPastAbility {
  import DateTimeCodecs._

  implicit val PokemonPastAbilityCodecJson: CodecJson[PokemonPastAbility] = CodecJson.derive[PokemonPastAbility]
  implicit val PokemonPastAbilityDecoder: EntityDecoder[PokemonPastAbility] = jsonOf[PokemonPastAbility]
  implicit val PokemonPastAbilityEncoder: EntityEncoder[PokemonPastAbility] = jsonEncoderOf[PokemonPastAbility]
}
