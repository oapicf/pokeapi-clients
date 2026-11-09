package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaPokemonEncounterVersion._

case class LocationAreaPokemonEncounterVersion (
  /* The game version this encounter happens in. */
  version: VersionSummary,
/* The total percentage of all encounter potential. */
  maxChance: Integer,
/* A list of encounters and their specifics. */
  encounterDetails: List[LocationAreaEncounterDetail])

object LocationAreaPokemonEncounterVersion {
  import DateTimeCodecs._

  implicit val LocationAreaPokemonEncounterVersionCodecJson: CodecJson[LocationAreaPokemonEncounterVersion] = CodecJson.derive[LocationAreaPokemonEncounterVersion]
  implicit val LocationAreaPokemonEncounterVersionDecoder: EntityDecoder[LocationAreaPokemonEncounterVersion] = jsonOf[LocationAreaPokemonEncounterVersion]
  implicit val LocationAreaPokemonEncounterVersionEncoder: EntityEncoder[LocationAreaPokemonEncounterVersion] = jsonEncoderOf[LocationAreaPokemonEncounterVersion]
}
