package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaEncounterDetail._

case class LocationAreaEncounterDetail (
  /* The lowest level the Pokémon could be encountered at. */
  minLevel: Integer,
/* The highest level the Pokémon could be encountered at. */
  maxLevel: Integer,
/* Percent chance that this encounter will occur. */
  chance: Option[Integer],
/* The method by which this encounter happens. */
  method: Option[EncounterMethodSummary],
/* A list of condition values that must be in effect for this encounter to occur. */
  conditionValues: List[EncounterConditionValueSummary],
/* Additional properties of the encountered Pokémon, or null if unspecified. */
  pokemonDetails: EncounterPokemonDetail)

object LocationAreaEncounterDetail {
  import DateTimeCodecs._

  implicit val LocationAreaEncounterDetailCodecJson: CodecJson[LocationAreaEncounterDetail] = CodecJson.derive[LocationAreaEncounterDetail]
  implicit val LocationAreaEncounterDetailDecoder: EntityDecoder[LocationAreaEncounterDetail] = jsonOf[LocationAreaEncounterDetail]
  implicit val LocationAreaEncounterDetailEncoder: EntityEncoder[LocationAreaEncounterDetail] = jsonEncoderOf[LocationAreaEncounterDetail]
}
