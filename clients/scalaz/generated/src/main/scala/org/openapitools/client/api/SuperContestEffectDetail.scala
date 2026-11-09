package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SuperContestEffectDetail._

case class SuperContestEffectDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The level of appeal this super contest effect has. */
  appeal: Integer,
/* The flavor text of this super contest effect listed in different languages. */
  flavorTextEntries: List[SuperContestEffectFlavorText],
/* A list of moves that have the effect when used in super contests. */
  moves: List[MoveSummary])

object SuperContestEffectDetail {
  import DateTimeCodecs._

  implicit val SuperContestEffectDetailCodecJson: CodecJson[SuperContestEffectDetail] = CodecJson.derive[SuperContestEffectDetail]
  implicit val SuperContestEffectDetailDecoder: EntityDecoder[SuperContestEffectDetail] = jsonOf[SuperContestEffectDetail]
  implicit val SuperContestEffectDetailEncoder: EntityEncoder[SuperContestEffectDetail] = jsonEncoderOf[SuperContestEffectDetail]
}
