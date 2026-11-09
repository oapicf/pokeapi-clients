package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorDetail._

case class BerryFlavorDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of the berries with this flavor. */
  berries: List[BerryFlavorBerryMap],
/* The contest type that correlates with this berry flavor. */
  contestType: ContestTypeSummary,
/* The name of this resource listed in different languages. */
  names: List[BerryFlavorName])

object BerryFlavorDetail {
  import DateTimeCodecs._

  implicit val BerryFlavorDetailCodecJson: CodecJson[BerryFlavorDetail] = CodecJson.derive[BerryFlavorDetail]
  implicit val BerryFlavorDetailDecoder: EntityDecoder[BerryFlavorDetail] = jsonOf[BerryFlavorDetail]
  implicit val BerryFlavorDetailEncoder: EntityEncoder[BerryFlavorDetail] = jsonEncoderOf[BerryFlavorDetail]
}
