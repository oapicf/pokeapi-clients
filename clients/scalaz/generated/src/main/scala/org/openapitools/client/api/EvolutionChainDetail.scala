package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionChainDetail._

case class EvolutionChainDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. */
  babyTriggerItem: ItemSummary,
/* The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. */
  chain: EvolutionChainLink)

object EvolutionChainDetail {
  import DateTimeCodecs._

  implicit val EvolutionChainDetailCodecJson: CodecJson[EvolutionChainDetail] = CodecJson.derive[EvolutionChainDetail]
  implicit val EvolutionChainDetailDecoder: EntityDecoder[EvolutionChainDetail] = jsonOf[EvolutionChainDetail]
  implicit val EvolutionChainDetailEncoder: EntityEncoder[EvolutionChainDetail] = jsonEncoderOf[EvolutionChainDetail]
}
