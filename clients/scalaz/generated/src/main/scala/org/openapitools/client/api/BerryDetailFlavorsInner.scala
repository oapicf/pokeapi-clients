package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryDetailFlavorsInner._

case class BerryDetailFlavorsInner (
  potency: Integer,
flavor: BerryDetailFlavorsInnerFlavor)

object BerryDetailFlavorsInner {
  import DateTimeCodecs._

  implicit val BerryDetailFlavorsInnerCodecJson: CodecJson[BerryDetailFlavorsInner] = CodecJson.derive[BerryDetailFlavorsInner]
  implicit val BerryDetailFlavorsInnerDecoder: EntityDecoder[BerryDetailFlavorsInner] = jsonOf[BerryDetailFlavorsInner]
  implicit val BerryDetailFlavorsInnerEncoder: EntityEncoder[BerryDetailFlavorsInner] = jsonEncoderOf[BerryDetailFlavorsInner]
}
