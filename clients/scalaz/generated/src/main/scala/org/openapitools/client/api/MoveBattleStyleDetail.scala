package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveBattleStyleDetail._

case class MoveBattleStyleDetail (
  id: Integer,
name: String,
names: List[MoveBattleStyleName])

object MoveBattleStyleDetail {
  import DateTimeCodecs._

  implicit val MoveBattleStyleDetailCodecJson: CodecJson[MoveBattleStyleDetail] = CodecJson.derive[MoveBattleStyleDetail]
  implicit val MoveBattleStyleDetailDecoder: EntityDecoder[MoveBattleStyleDetail] = jsonOf[MoveBattleStyleDetail]
  implicit val MoveBattleStyleDetailEncoder: EntityEncoder[MoveBattleStyleDetail] = jsonEncoderOf[MoveBattleStyleDetail]
}
