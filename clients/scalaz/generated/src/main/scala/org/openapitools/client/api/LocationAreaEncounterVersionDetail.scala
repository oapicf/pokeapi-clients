package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationAreaEncounterVersionDetail._

case class LocationAreaEncounterVersionDetail (
  /* The chance of an encounter to occur. */
  rate: Integer,
/* The version of the game in which the encounter can occur with the given chance. */
  version: VersionSummary)

object LocationAreaEncounterVersionDetail {
  import DateTimeCodecs._

  implicit val LocationAreaEncounterVersionDetailCodecJson: CodecJson[LocationAreaEncounterVersionDetail] = CodecJson.derive[LocationAreaEncounterVersionDetail]
  implicit val LocationAreaEncounterVersionDetailDecoder: EntityDecoder[LocationAreaEncounterVersionDetail] = jsonOf[LocationAreaEncounterVersionDetail]
  implicit val LocationAreaEncounterVersionDetailEncoder: EntityEncoder[LocationAreaEncounterVersionDetail] = jsonEncoderOf[LocationAreaEncounterVersionDetail]
}
