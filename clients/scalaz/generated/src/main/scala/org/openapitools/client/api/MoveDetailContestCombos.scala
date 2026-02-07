package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailContestCombos._

case class MoveDetailContestCombos (
  normal: MoveDetailContestCombosNormal,
`super`: MoveDetailContestCombosNormal)

object MoveDetailContestCombos {
  import DateTimeCodecs._

  implicit val MoveDetailContestCombosCodecJson: CodecJson[MoveDetailContestCombos] = CodecJson.derive[MoveDetailContestCombos]
  implicit val MoveDetailContestCombosDecoder: EntityDecoder[MoveDetailContestCombos] = jsonOf[MoveDetailContestCombos]
  implicit val MoveDetailContestCombosEncoder: EntityEncoder[MoveDetailContestCombos] = jsonEncoderOf[MoveDetailContestCombos]
}
