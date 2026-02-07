package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestTypeDetail._

case class ContestTypeDetail (
  id: Integer,
name: String,
berryFlavor: BerryFlavorSummary,
names: List[ContestTypeName])

object ContestTypeDetail {
  import DateTimeCodecs._

  implicit val ContestTypeDetailCodecJson: CodecJson[ContestTypeDetail] = CodecJson.derive[ContestTypeDetail]
  implicit val ContestTypeDetailDecoder: EntityDecoder[ContestTypeDetail] = jsonOf[ContestTypeDetail]
  implicit val ContestTypeDetailEncoder: EntityEncoder[ContestTypeDetail] = jsonEncoderOf[ContestTypeDetail]
}
