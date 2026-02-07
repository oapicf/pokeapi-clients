package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocationDetail._

case class LocationDetail (
  id: Integer,
name: String,
region: RegionSummary,
names: List[LocationName],
gameIndices: List[LocationGameIndex],
areas: List[LocationAreaSummary])

object LocationDetail {
  import DateTimeCodecs._

  implicit val LocationDetailCodecJson: CodecJson[LocationDetail] = CodecJson.derive[LocationDetail]
  implicit val LocationDetailDecoder: EntityDecoder[LocationDetail] = jsonOf[LocationDetail]
  implicit val LocationDetailEncoder: EntityEncoder[LocationDetail] = jsonEncoderOf[LocationDetail]
}
