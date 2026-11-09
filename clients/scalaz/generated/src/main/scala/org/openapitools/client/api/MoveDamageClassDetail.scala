package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDamageClassDetail._

case class MoveDamageClassDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The description of this resource listed in different languages. */
  descriptions: List[MoveDamageClassDescription],
/* A list of moves that fall into this damage class. */
  moves: List[MoveSummary],
/* The name of this resource listed in different languages. */
  names: List[MoveDamageClassName])

object MoveDamageClassDetail {
  import DateTimeCodecs._

  implicit val MoveDamageClassDetailCodecJson: CodecJson[MoveDamageClassDetail] = CodecJson.derive[MoveDamageClassDetail]
  implicit val MoveDamageClassDetailDecoder: EntityDecoder[MoveDamageClassDetail] = jsonOf[MoveDamageClassDetail]
  implicit val MoveDamageClassDetailEncoder: EntityEncoder[MoveDamageClassDetail] = jsonEncoderOf[MoveDamageClassDetail]
}
