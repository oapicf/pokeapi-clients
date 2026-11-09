package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PalParkAreaDetail._

case class PalParkAreaDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[PalParkAreaName],
/* A list of Pokémon encountered in thi pal park area along with details. */
  pokemonEncounters: List[PalParkEncounter])

object PalParkAreaDetail {
  import DateTimeCodecs._

  implicit val PalParkAreaDetailCodecJson: CodecJson[PalParkAreaDetail] = CodecJson.derive[PalParkAreaDetail]
  implicit val PalParkAreaDetailDecoder: EntityDecoder[PalParkAreaDetail] = jsonOf[PalParkAreaDetail]
  implicit val PalParkAreaDetailEncoder: EntityEncoder[PalParkAreaDetail] = jsonEncoderOf[PalParkAreaDetail]
}
