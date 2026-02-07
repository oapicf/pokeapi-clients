package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaDetail._

case class LocationAreaDetail (
  id: Integer,
name: String,
gameIndex: Integer,
encounterMethodRates: List[LocationAreaDetailEncounterMethodRatesInner],
location: LocationSummary,
names: List[LocationAreaName],
pokemonEncounters: List[LocationAreaDetailPokemonEncountersInner])

object LocationAreaDetail {
  import DateTimeCodecs._

  implicit val LocationAreaDetailCodecJson: CodecJson[LocationAreaDetail] = CodecJson.derive[LocationAreaDetail]
  implicit val LocationAreaDetailDecoder: EntityDecoder[LocationAreaDetail] = jsonOf[LocationAreaDetail]
  implicit val LocationAreaDetailEncoder: EntityEncoder[LocationAreaDetail] = jsonEncoderOf[LocationAreaDetail]
}
