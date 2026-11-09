package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryDetail._

case class BerryDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked. */
  growthTime: Option[Integer],
/* The maximum number of these berries that can grow on one tree in Generation IV. */
  maxHarvest: Option[Integer],
/* The power of the move \"Natural Gift\" when used with this Berry. */
  naturalGiftPower: Option[Integer],
/* The size of this Berry, in millimeters. */
  size: Option[Integer],
/* The smoothness of this Berry, used in making Pokéblocks or Poffins. */
  smoothness: Option[Integer],
/* The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly. */
  soilDryness: Option[Integer],
/* The firmness of this berry, used in making Pokéblocks or Poffins. */
  firmness: BerryFirmnessSummary,
/* A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry. */
  flavors: List[BerryFlavorMap],
/* Berries are actually items. This is a reference to the item specific data for this berry. */
  item: ItemSummary,
/* The type inherited by \"Natural Gift\" when used with this Berry. */
  naturalGiftType: TypeSummary)

object BerryDetail {
  import DateTimeCodecs._

  implicit val BerryDetailCodecJson: CodecJson[BerryDetail] = CodecJson.derive[BerryDetail]
  implicit val BerryDetailDecoder: EntityDecoder[BerryDetail] = jsonOf[BerryDetail]
  implicit val BerryDetailEncoder: EntityEncoder[BerryDetail] = jsonEncoderOf[BerryDetail]
}
