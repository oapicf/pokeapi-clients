package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationDetail._

case class LocationDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The region this location can be found in. */
  region: RegionSummary,
/* The name of this resource listed in different languages. */
  names: List[LocationName],
/* A list of game indices relevent to this location by generation. */
  gameIndices: List[LocationGameIndex],
/* Areas that can be found within this location. */
  areas: List[LocationAreaSummary])

object LocationDetail {
  import DateTimeCodecs._

  implicit val LocationDetailCodecJson: CodecJson[LocationDetail] = CodecJson.derive[LocationDetail]
  implicit val LocationDetailDecoder: EntityDecoder[LocationDetail] = jsonOf[LocationDetail]
  implicit val LocationDetailEncoder: EntityEncoder[LocationDetail] = jsonEncoderOf[LocationDetail]
}
