package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalParkEncounter._

case class PalParkEncounter (
  /* The base score given to the player when this Pokémon is caught during a pal park run. */
  baseScore: Option[Integer],
/* The base rate for encountering this Pokémon in this pal park area. */
  rate: Integer,
/* The Pokémon species being encountered. */
  pokemonSpecies: PokemonSpeciesSummary)

object PalParkEncounter {
  import DateTimeCodecs._

  implicit val PalParkEncounterCodecJson: CodecJson[PalParkEncounter] = CodecJson.derive[PalParkEncounter]
  implicit val PalParkEncounterDecoder: EntityDecoder[PalParkEncounter] = jsonOf[PalParkEncounter]
  implicit val PalParkEncounterEncoder: EntityEncoder[PalParkEncounter] = jsonEncoderOf[PalParkEncounter]
}
