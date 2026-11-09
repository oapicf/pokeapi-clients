package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaDetail._

case class LocationAreaDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The internal id of an API resource within game data. */
  gameIndex: Integer,
/* A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. */
  encounterMethodRates: List[LocationAreaEncounterRate],
/* The region this location area can be found in. */
  location: LocationSummary,
/* The name of this resource listed in different languages. */
  names: List[LocationAreaName],
/* A list of Pokémon that can be encountered in this area along with version specific details about the encounter. */
  pokemonEncounters: List[LocationAreaPokemonEncounter])

object LocationAreaDetail {
  import DateTimeCodecs._

  implicit val LocationAreaDetailCodecJson: CodecJson[LocationAreaDetail] = CodecJson.derive[LocationAreaDetail]
  implicit val LocationAreaDetailDecoder: EntityDecoder[LocationAreaDetail] = jsonOf[LocationAreaDetail]
  implicit val LocationAreaDetailEncoder: EntityEncoder[LocationAreaDetail] = jsonEncoderOf[LocationAreaDetail]
}
