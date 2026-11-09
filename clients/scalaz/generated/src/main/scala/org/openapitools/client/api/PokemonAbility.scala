package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonAbility._

case class PokemonAbility (
  /* Whether or not this is a hidden ability. */
  isHidden: Option[Boolean],
/* The slot this ability occupies in this Pokémon species. */
  slot: Integer,
/* The ability the Pokémon may have. */
  ability: AbilitySummary)

object PokemonAbility {
  import DateTimeCodecs._

  implicit val PokemonAbilityCodecJson: CodecJson[PokemonAbility] = CodecJson.derive[PokemonAbility]
  implicit val PokemonAbilityDecoder: EntityDecoder[PokemonAbility] = jsonOf[PokemonAbility]
  implicit val PokemonAbilityEncoder: EntityEncoder[PokemonAbility] = jsonEncoderOf[PokemonAbility]
}
