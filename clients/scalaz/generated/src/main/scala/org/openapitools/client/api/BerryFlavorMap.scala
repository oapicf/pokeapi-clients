package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BerryFlavorMap._

case class BerryFlavorMap (
  /* How powerful the referenced flavor is for this berry. */
  potency: Integer,
/* The referenced berry flavor. */
  flavor: BerryFlavorSummary)

object BerryFlavorMap {
  import DateTimeCodecs._

  implicit val BerryFlavorMapCodecJson: CodecJson[BerryFlavorMap] = CodecJson.derive[BerryFlavorMap]
  implicit val BerryFlavorMapDecoder: EntityDecoder[BerryFlavorMap] = jsonOf[BerryFlavorMap]
  implicit val BerryFlavorMapEncoder: EntityEncoder[BerryFlavorMap] = jsonEncoderOf[BerryFlavorMap]
}
