package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionChainDetail._

case class EvolutionChainDetail (
  id: Integer,
babyTriggerItem: ItemSummary,
chain: EvolutionChainDetailChain)

object EvolutionChainDetail {
  import DateTimeCodecs._

  implicit val EvolutionChainDetailCodecJson: CodecJson[EvolutionChainDetail] = CodecJson.derive[EvolutionChainDetail]
  implicit val EvolutionChainDetailDecoder: EntityDecoder[EvolutionChainDetail] = jsonOf[EvolutionChainDetail]
  implicit val EvolutionChainDetailEncoder: EntityEncoder[EvolutionChainDetail] = jsonEncoderOf[EvolutionChainDetail]
}
