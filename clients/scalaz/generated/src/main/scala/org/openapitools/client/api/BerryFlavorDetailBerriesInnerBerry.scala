package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import BerryFlavorDetailBerriesInnerBerry._

case class BerryFlavorDetailBerriesInnerBerry (
  /* The name of the berry */
  name: Option[String],
/* The URL to get more information about the berry */
  url: Option[URI])

object BerryFlavorDetailBerriesInnerBerry {
  import DateTimeCodecs._

  implicit val BerryFlavorDetailBerriesInnerBerryCodecJson: CodecJson[BerryFlavorDetailBerriesInnerBerry] = CodecJson.derive[BerryFlavorDetailBerriesInnerBerry]
  implicit val BerryFlavorDetailBerriesInnerBerryDecoder: EntityDecoder[BerryFlavorDetailBerriesInnerBerry] = jsonOf[BerryFlavorDetailBerriesInnerBerry]
  implicit val BerryFlavorDetailBerriesInnerBerryEncoder: EntityEncoder[BerryFlavorDetailBerriesInnerBerry] = jsonEncoderOf[BerryFlavorDetailBerriesInnerBerry]
}
