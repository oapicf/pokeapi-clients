package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorDetailBerriesInner._

case class BerryFlavorDetailBerriesInner (
  potency: Integer,
berry: BerryFlavorDetailBerriesInnerBerry)

object BerryFlavorDetailBerriesInner {
  import DateTimeCodecs._

  implicit val BerryFlavorDetailBerriesInnerCodecJson: CodecJson[BerryFlavorDetailBerriesInner] = CodecJson.derive[BerryFlavorDetailBerriesInner]
  implicit val BerryFlavorDetailBerriesInnerDecoder: EntityDecoder[BerryFlavorDetailBerriesInner] = jsonOf[BerryFlavorDetailBerriesInner]
  implicit val BerryFlavorDetailBerriesInnerEncoder: EntityEncoder[BerryFlavorDetailBerriesInner] = jsonEncoderOf[BerryFlavorDetailBerriesInner]
}
