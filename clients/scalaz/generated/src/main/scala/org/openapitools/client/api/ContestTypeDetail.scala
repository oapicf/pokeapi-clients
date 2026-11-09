package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ContestTypeDetail._

case class ContestTypeDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The berry flavor that correlates with this contest type. */
  berryFlavor: BerryFlavorSummary,
/* The name of this contest type listed in different languages. */
  names: List[ContestTypeName])

object ContestTypeDetail {
  import DateTimeCodecs._

  implicit val ContestTypeDetailCodecJson: CodecJson[ContestTypeDetail] = CodecJson.derive[ContestTypeDetail]
  implicit val ContestTypeDetailDecoder: EntityDecoder[ContestTypeDetail] = jsonOf[ContestTypeDetail]
  implicit val ContestTypeDetailEncoder: EntityEncoder[ContestTypeDetail] = jsonEncoderOf[ContestTypeDetail]
}
