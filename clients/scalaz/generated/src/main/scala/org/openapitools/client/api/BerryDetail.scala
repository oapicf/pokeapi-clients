package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryDetail._

case class BerryDetail (
  id: Integer,
name: String,
growthTime: Integer,
maxHarvest: Integer,
naturalGiftPower: Integer,
size: Integer,
smoothness: Integer,
soilDryness: Integer,
firmness: BerryFirmnessSummary,
flavors: List[BerryDetailFlavorsInner],
item: ItemSummary,
naturalGiftType: TypeSummary)

object BerryDetail {
  import DateTimeCodecs._

  implicit val BerryDetailCodecJson: CodecJson[BerryDetail] = CodecJson.derive[BerryDetail]
  implicit val BerryDetailDecoder: EntityDecoder[BerryDetail] = jsonOf[BerryDetail]
  implicit val BerryDetailEncoder: EntityEncoder[BerryDetail] = jsonEncoderOf[BerryDetail]
}
