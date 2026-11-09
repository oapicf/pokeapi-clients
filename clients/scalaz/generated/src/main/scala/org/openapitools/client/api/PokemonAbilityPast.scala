package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonAbilityPast._

case class PokemonAbilityPast (
  /* Whether or not this is a hidden ability. */
  isHidden: Option[Boolean],
/* The slot this ability occupies in this Pokémon species. */
  slot: Integer,
/* The ability the Pokémon may have. */
  ability: AbilitySummary)

object PokemonAbilityPast {
  import DateTimeCodecs._

  implicit val PokemonAbilityPastCodecJson: CodecJson[PokemonAbilityPast] = CodecJson.derive[PokemonAbilityPast]
  implicit val PokemonAbilityPastDecoder: EntityDecoder[PokemonAbilityPast] = jsonOf[PokemonAbilityPast]
  implicit val PokemonAbilityPastEncoder: EntityEncoder[PokemonAbilityPast] = jsonEncoderOf[PokemonAbilityPast]
}
