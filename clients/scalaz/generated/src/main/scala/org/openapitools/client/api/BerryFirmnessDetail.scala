package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFirmnessDetail._

case class BerryFirmnessDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of the berries with this firmness. */
  berries: List[BerrySummary],
/* The name of this resource listed in different languages. */
  names: List[BerryFirmnessName])

object BerryFirmnessDetail {
  import DateTimeCodecs._

  implicit val BerryFirmnessDetailCodecJson: CodecJson[BerryFirmnessDetail] = CodecJson.derive[BerryFirmnessDetail]
  implicit val BerryFirmnessDetailDecoder: EntityDecoder[BerryFirmnessDetail] = jsonOf[BerryFirmnessDetail]
  implicit val BerryFirmnessDetailEncoder: EntityEncoder[BerryFirmnessDetail] = jsonEncoderOf[BerryFirmnessDetail]
}
