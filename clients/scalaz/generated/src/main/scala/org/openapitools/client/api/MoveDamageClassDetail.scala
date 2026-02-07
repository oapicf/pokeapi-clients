package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDamageClassDetail._

case class MoveDamageClassDetail (
  id: Integer,
name: String,
descriptions: List[MoveDamageClassDescription],
moves: List[MoveSummary],
names: List[MoveDamageClassName])

object MoveDamageClassDetail {
  import DateTimeCodecs._

  implicit val MoveDamageClassDetailCodecJson: CodecJson[MoveDamageClassDetail] = CodecJson.derive[MoveDamageClassDetail]
  implicit val MoveDamageClassDetailDecoder: EntityDecoder[MoveDamageClassDetail] = jsonOf[MoveDamageClassDetail]
  implicit val MoveDamageClassDetailEncoder: EntityEncoder[MoveDamageClassDetail] = jsonEncoderOf[MoveDamageClassDetail]
}
