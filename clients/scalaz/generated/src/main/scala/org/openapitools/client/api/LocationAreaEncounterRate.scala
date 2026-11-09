package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaEncounterRate._

case class LocationAreaEncounterRate (
  /* The method in which Pokémon may be encountered in an area.. */
  encounterMethod: EncounterMethodSummary,
/* The chance of the encounter to occur on a version of the game. */
  versionDetails: List[LocationAreaEncounterVersionDetail])

object LocationAreaEncounterRate {
  import DateTimeCodecs._

  implicit val LocationAreaEncounterRateCodecJson: CodecJson[LocationAreaEncounterRate] = CodecJson.derive[LocationAreaEncounterRate]
  implicit val LocationAreaEncounterRateDecoder: EntityDecoder[LocationAreaEncounterRate] = jsonOf[LocationAreaEncounterRate]
  implicit val LocationAreaEncounterRateEncoder: EntityEncoder[LocationAreaEncounterRate] = jsonEncoderOf[LocationAreaEncounterRate]
}
