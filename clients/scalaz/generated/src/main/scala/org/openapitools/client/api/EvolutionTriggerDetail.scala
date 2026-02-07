package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionTriggerDetail._

case class EvolutionTriggerDetail (
  id: Integer,
name: String,
names: List[EvolutionTriggerName],
pokemonSpecies: List[AbilityDetailPokemonInnerPokemon])

object EvolutionTriggerDetail {
  import DateTimeCodecs._

  implicit val EvolutionTriggerDetailCodecJson: CodecJson[EvolutionTriggerDetail] = CodecJson.derive[EvolutionTriggerDetail]
  implicit val EvolutionTriggerDetailDecoder: EntityDecoder[EvolutionTriggerDetail] = jsonOf[EvolutionTriggerDetail]
  implicit val EvolutionTriggerDetailEncoder: EntityEncoder[EvolutionTriggerDetail] = jsonEncoderOf[EvolutionTriggerDetail]
}
