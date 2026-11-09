package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonEncounterVersionDetailResponse._

case class PokemonEncounterVersionDetailResponse (
  /* The game version this encounter happens in. */
  version: VersionSummary,
/* The total percentage of all encounter potential. */
  maxChance: Integer,
/* A list of encounters and their specifics. */
  encounterDetails: List[PokemonEncounterDetailResponse])

object PokemonEncounterVersionDetailResponse {
  import DateTimeCodecs._

  implicit val PokemonEncounterVersionDetailResponseCodecJson: CodecJson[PokemonEncounterVersionDetailResponse] = CodecJson.derive[PokemonEncounterVersionDetailResponse]
  implicit val PokemonEncounterVersionDetailResponseDecoder: EntityDecoder[PokemonEncounterVersionDetailResponse] = jsonOf[PokemonEncounterVersionDetailResponse]
  implicit val PokemonEncounterVersionDetailResponseEncoder: EntityEncoder[PokemonEncounterVersionDetailResponse] = jsonEncoderOf[PokemonEncounterVersionDetailResponse]
}
