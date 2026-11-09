package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaPokemonEncounter._

case class LocationAreaPokemonEncounter (
  /* The Pokémon being encountered. */
  pokemon: PokemonSummary,
/* A list of versions and encounters with Pokémon that might happen in the referenced location area. */
  versionDetails: List[LocationAreaPokemonEncounterVersion])

object LocationAreaPokemonEncounter {
  import DateTimeCodecs._

  implicit val LocationAreaPokemonEncounterCodecJson: CodecJson[LocationAreaPokemonEncounter] = CodecJson.derive[LocationAreaPokemonEncounter]
  implicit val LocationAreaPokemonEncounterDecoder: EntityDecoder[LocationAreaPokemonEncounter] = jsonOf[LocationAreaPokemonEncounter]
  implicit val LocationAreaPokemonEncounterEncoder: EntityEncoder[LocationAreaPokemonEncounter] = jsonEncoderOf[LocationAreaPokemonEncounter]
}
