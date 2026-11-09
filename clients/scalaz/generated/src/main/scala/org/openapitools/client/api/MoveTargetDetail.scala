package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveTargetDetail._

case class MoveTargetDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The description of this resource listed in different languages. */
  descriptions: List[MoveTargetDescription],
/* A list of moves that that are directed at this target. */
  moves: List[MoveSummary],
/* The name of this resource listed in different languages. */
  names: List[MoveTargetName])

object MoveTargetDetail {
  import DateTimeCodecs._

  implicit val MoveTargetDetailCodecJson: CodecJson[MoveTargetDetail] = CodecJson.derive[MoveTargetDetail]
  implicit val MoveTargetDetailDecoder: EntityDecoder[MoveTargetDetail] = jsonOf[MoveTargetDetail]
  implicit val MoveTargetDetailEncoder: EntityEncoder[MoveTargetDetail] = jsonEncoderOf[MoveTargetDetail]
}
