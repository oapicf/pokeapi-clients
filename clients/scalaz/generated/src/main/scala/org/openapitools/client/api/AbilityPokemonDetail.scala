package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityPokemonDetail._

case class AbilityPokemonDetail (
  /* Whether or not this a hidden ability for the referenced Pokémon. */
  isHidden: Option[Boolean],
/* Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. */
  slot: Integer,
/* The Pokémon this ability could belong to. */
  pokemon: PokemonSummary)

object AbilityPokemonDetail {
  import DateTimeCodecs._

  implicit val AbilityPokemonDetailCodecJson: CodecJson[AbilityPokemonDetail] = CodecJson.derive[AbilityPokemonDetail]
  implicit val AbilityPokemonDetailDecoder: EntityDecoder[AbilityPokemonDetail] = jsonOf[AbilityPokemonDetail]
  implicit val AbilityPokemonDetailEncoder: EntityEncoder[AbilityPokemonDetail] = jsonEncoderOf[AbilityPokemonDetail]
}
