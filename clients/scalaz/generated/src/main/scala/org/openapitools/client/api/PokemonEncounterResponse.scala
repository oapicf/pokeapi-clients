package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonEncounterResponse._

case class PokemonEncounterResponse (
  /* The location area the referenced Pokémon can be encountered in. */
  locationArea: LocationAreaSummary,
/* A list of versions and encounters with the referenced Pokémon that might happen. */
  versionDetails: List[PokemonEncounterVersionDetailResponse])

object PokemonEncounterResponse {
  import DateTimeCodecs._

  implicit val PokemonEncounterResponseCodecJson: CodecJson[PokemonEncounterResponse] = CodecJson.derive[PokemonEncounterResponse]
  implicit val PokemonEncounterResponseDecoder: EntityDecoder[PokemonEncounterResponse] = jsonOf[PokemonEncounterResponse]
  implicit val PokemonEncounterResponseEncoder: EntityEncoder[PokemonEncounterResponse] = jsonEncoderOf[PokemonEncounterResponse]
}
