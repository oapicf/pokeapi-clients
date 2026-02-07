package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionChainDetailChain._

case class EvolutionChainDetailChain (
  evolutionDetails: List[AnyType],
evolvesTo: List[EvolutionChainDetailChainEvolvesToInner],
isBaby: Boolean,
species: AbilityDetailPokemonInnerPokemon)

object EvolutionChainDetailChain {
  import DateTimeCodecs._

  implicit val EvolutionChainDetailChainCodecJson: CodecJson[EvolutionChainDetailChain] = CodecJson.derive[EvolutionChainDetailChain]
  implicit val EvolutionChainDetailChainDecoder: EntityDecoder[EvolutionChainDetailChain] = jsonOf[EvolutionChainDetailChain]
  implicit val EvolutionChainDetailChainEncoder: EntityEncoder[EvolutionChainDetailChain] = jsonEncoderOf[EvolutionChainDetailChain]
}
