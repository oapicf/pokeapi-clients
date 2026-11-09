package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionTriggerDetail._

case class EvolutionTriggerDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The name of this resource listed in different languages. */
  names: List[EvolutionTriggerName],
/* A list of pokemon species that result from this evolution trigger. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object EvolutionTriggerDetail {
  import DateTimeCodecs._

  implicit val EvolutionTriggerDetailCodecJson: CodecJson[EvolutionTriggerDetail] = CodecJson.derive[EvolutionTriggerDetail]
  implicit val EvolutionTriggerDetailDecoder: EntityDecoder[EvolutionTriggerDetail] = jsonOf[EvolutionTriggerDetail]
  implicit val EvolutionTriggerDetailEncoder: EntityEncoder[EvolutionTriggerDetail] = jsonEncoderOf[EvolutionTriggerDetail]
}
