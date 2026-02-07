package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuperContestEffectDetail._

case class SuperContestEffectDetail (
  id: Integer,
appeal: Integer,
flavorTextEntries: List[SuperContestEffectFlavorText],
moves: List[MoveSummary])

object SuperContestEffectDetail {
  import DateTimeCodecs._

  implicit val SuperContestEffectDetailCodecJson: CodecJson[SuperContestEffectDetail] = CodecJson.derive[SuperContestEffectDetail]
  implicit val SuperContestEffectDetailDecoder: EntityDecoder[SuperContestEffectDetail] = jsonOf[SuperContestEffectDetail]
  implicit val SuperContestEffectDetailEncoder: EntityEncoder[SuperContestEffectDetail] = jsonEncoderOf[SuperContestEffectDetail]
}
