package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import BerryDetailFlavorsInnerFlavor._

case class BerryDetailFlavorsInnerFlavor (
  /* The name of the flavor */
  name: Option[String],
/* The URL to get more information about the flavor */
  url: Option[URI])

object BerryDetailFlavorsInnerFlavor {
  import DateTimeCodecs._

  implicit val BerryDetailFlavorsInnerFlavorCodecJson: CodecJson[BerryDetailFlavorsInnerFlavor] = CodecJson.derive[BerryDetailFlavorsInnerFlavor]
  implicit val BerryDetailFlavorsInnerFlavorDecoder: EntityDecoder[BerryDetailFlavorsInnerFlavor] = jsonOf[BerryDetailFlavorsInnerFlavor]
  implicit val BerryDetailFlavorsInnerFlavorEncoder: EntityEncoder[BerryDetailFlavorsInnerFlavor] = jsonEncoderOf[BerryDetailFlavorsInnerFlavor]
}
