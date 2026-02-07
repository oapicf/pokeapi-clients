package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveTargetDetail._

case class MoveTargetDetail (
  id: Integer,
name: String,
descriptions: List[MoveTargetDescription],
moves: List[MoveSummary],
names: List[MoveTargetName])

object MoveTargetDetail {
  import DateTimeCodecs._

  implicit val MoveTargetDetailCodecJson: CodecJson[MoveTargetDetail] = CodecJson.derive[MoveTargetDetail]
  implicit val MoveTargetDetailDecoder: EntityDecoder[MoveTargetDetail] = jsonOf[MoveTargetDetail]
  implicit val MoveTargetDetailEncoder: EntityEncoder[MoveTargetDetail] = jsonEncoderOf[MoveTargetDetail]
}
