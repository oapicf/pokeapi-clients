package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterPokemonDetail._

case class EncounterPokemonDetail (
  /* The minimum number of perfect IVs, or null if unspecified. */
  minPerfectIvs: Option[Integer],
/* Whether the encountered Pokémon is always shiny. */
  alwaysShiny: Option[Boolean],
/* Whether the encountered Pokémon can never be shiny. */
  neverShiny: Option[Boolean],
/* Whether the encountered Pokémon is an alpha Pokémon. */
  isAlpha: Option[Boolean])

object EncounterPokemonDetail {
  import DateTimeCodecs._

  implicit val EncounterPokemonDetailCodecJson: CodecJson[EncounterPokemonDetail] = CodecJson.derive[EncounterPokemonDetail]
  implicit val EncounterPokemonDetailDecoder: EntityDecoder[EncounterPokemonDetail] = jsonOf[EncounterPokemonDetail]
  implicit val EncounterPokemonDetailEncoder: EntityEncoder[EncounterPokemonDetail] = jsonEncoderOf[EncounterPokemonDetail]
}
