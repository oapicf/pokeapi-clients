package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorBerryMap._

case class BerryFlavorBerryMap (
  /* How powerful the referenced flavor is for this berry. */
  potency: Integer,
/* The berry with the referenced flavor. */
  berry: BerrySummary)

object BerryFlavorBerryMap {
  import DateTimeCodecs._

  implicit val BerryFlavorBerryMapCodecJson: CodecJson[BerryFlavorBerryMap] = CodecJson.derive[BerryFlavorBerryMap]
  implicit val BerryFlavorBerryMapDecoder: EntityDecoder[BerryFlavorBerryMap] = jsonOf[BerryFlavorBerryMap]
  implicit val BerryFlavorBerryMapEncoder: EntityEncoder[BerryFlavorBerryMap] = jsonEncoderOf[BerryFlavorBerryMap]
}
