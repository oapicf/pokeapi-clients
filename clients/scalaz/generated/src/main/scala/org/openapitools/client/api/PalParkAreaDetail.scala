package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalParkAreaDetail._

case class PalParkAreaDetail (
  id: Integer,
name: String,
names: List[PalParkAreaName],
pokemonEncounters: List[PalParkAreaDetailPokemonEncountersInner])

object PalParkAreaDetail {
  import DateTimeCodecs._

  implicit val PalParkAreaDetailCodecJson: CodecJson[PalParkAreaDetail] = CodecJson.derive[PalParkAreaDetail]
  implicit val PalParkAreaDetailDecoder: EntityDecoder[PalParkAreaDetail] = jsonOf[PalParkAreaDetail]
  implicit val PalParkAreaDetailEncoder: EntityEncoder[PalParkAreaDetail] = jsonEncoderOf[PalParkAreaDetail]
}
