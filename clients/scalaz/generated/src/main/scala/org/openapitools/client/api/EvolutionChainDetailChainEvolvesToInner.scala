package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionChainDetailChainEvolvesToInner._

case class EvolutionChainDetailChainEvolvesToInner (
  evolutionDetails: List[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
isBaby: Boolean,
species: AbilityDetailPokemonInnerPokemon)

object EvolutionChainDetailChainEvolvesToInner {
  import DateTimeCodecs._

  implicit val EvolutionChainDetailChainEvolvesToInnerCodecJson: CodecJson[EvolutionChainDetailChainEvolvesToInner] = CodecJson.derive[EvolutionChainDetailChainEvolvesToInner]
  implicit val EvolutionChainDetailChainEvolvesToInnerDecoder: EntityDecoder[EvolutionChainDetailChainEvolvesToInner] = jsonOf[EvolutionChainDetailChainEvolvesToInner]
  implicit val EvolutionChainDetailChainEvolvesToInnerEncoder: EntityEncoder[EvolutionChainDetailChainEvolvesToInner] = jsonEncoderOf[EvolutionChainDetailChainEvolvesToInner]
}
