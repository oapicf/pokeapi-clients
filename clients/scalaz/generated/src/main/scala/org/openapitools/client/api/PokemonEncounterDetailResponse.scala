package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonEncounterDetailResponse._

case class PokemonEncounterDetailResponse (
  /* Percent chance that this encounter will occur. */
  chance: Integer,
/* A list of condition values that must be in effect for this encounter to occur. */
  conditionValues: List[EncounterConditionValueSummary],
/* The highest level the Pokémon could be encountered at. */
  maxLevel: Integer,
/* The method by which this encounter happens. */
  method: EncounterMethodSummary,
/* The lowest level the Pokémon could be encountered at. */
  minLevel: Integer)

object PokemonEncounterDetailResponse {
  import DateTimeCodecs._

  implicit val PokemonEncounterDetailResponseCodecJson: CodecJson[PokemonEncounterDetailResponse] = CodecJson.derive[PokemonEncounterDetailResponse]
  implicit val PokemonEncounterDetailResponseDecoder: EntityDecoder[PokemonEncounterDetailResponse] = jsonOf[PokemonEncounterDetailResponse]
  implicit val PokemonEncounterDetailResponseEncoder: EntityEncoder[PokemonEncounterDetailResponse] = jsonEncoderOf[PokemonEncounterDetailResponse]
}
