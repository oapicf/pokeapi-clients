package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonSpeciesPalParkEncounter._

case class PokemonSpeciesPalParkEncounter (
  /* The base score given to the player when the referenced Pokémon is caught during a pal park run. */
  baseScore: Option[Integer],
/* The base rate for encountering the referenced Pokémon in this pal park area. */
  rate: Integer,
/* The pal park area where this encounter happens. */
  area: PalParkAreaSummary)

object PokemonSpeciesPalParkEncounter {
  import DateTimeCodecs._

  implicit val PokemonSpeciesPalParkEncounterCodecJson: CodecJson[PokemonSpeciesPalParkEncounter] = CodecJson.derive[PokemonSpeciesPalParkEncounter]
  implicit val PokemonSpeciesPalParkEncounterDecoder: EntityDecoder[PokemonSpeciesPalParkEncounter] = jsonOf[PokemonSpeciesPalParkEncounter]
  implicit val PokemonSpeciesPalParkEncounterEncoder: EntityEncoder[PokemonSpeciesPalParkEncounter] = jsonEncoderOf[PokemonSpeciesPalParkEncounter]
}
