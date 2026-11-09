package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaCategoryDetail._

case class MoveMetaCategoryDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The description of this resource listed in different languages. */
  descriptions: List[MoveMetaCategoryDescription],
/* A list of moves that fall into this category. */
  moves: List[MoveSummary])

object MoveMetaCategoryDetail {
  import DateTimeCodecs._

  implicit val MoveMetaCategoryDetailCodecJson: CodecJson[MoveMetaCategoryDetail] = CodecJson.derive[MoveMetaCategoryDetail]
  implicit val MoveMetaCategoryDetailDecoder: EntityDecoder[MoveMetaCategoryDetail] = jsonOf[MoveMetaCategoryDetail]
  implicit val MoveMetaCategoryDetailEncoder: EntityEncoder[MoveMetaCategoryDetail] = jsonEncoderOf[MoveMetaCategoryDetail]
}
