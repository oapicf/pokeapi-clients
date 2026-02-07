package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorDetail._

case class BerryFlavorDetail (
  id: Integer,
name: String,
berries: List[BerryFlavorDetailBerriesInner],
contestType: ContestTypeSummary,
names: List[BerryFlavorName])

object BerryFlavorDetail {
  import DateTimeCodecs._

  implicit val BerryFlavorDetailCodecJson: CodecJson[BerryFlavorDetail] = CodecJson.derive[BerryFlavorDetail]
  implicit val BerryFlavorDetailDecoder: EntityDecoder[BerryFlavorDetail] = jsonOf[BerryFlavorDetail]
  implicit val BerryFlavorDetailEncoder: EntityEncoder[BerryFlavorDetail] = jsonEncoderOf[BerryFlavorDetail]
}
