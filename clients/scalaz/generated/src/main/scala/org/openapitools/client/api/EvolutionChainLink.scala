package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EvolutionChainLink._

case class EvolutionChainLink (
  /* Whether or not this link is for a baby Pokémon. This would only ever be true on the base link. */
  isBaby: Boolean,
/* The Pokémon species at this point in the evolution chain. */
  species: PokemonSpeciesSummary,
/* All details regarding the specific details of the referenced Pokémon species evolution. */
  evolutionDetails: List[PokemonEvolution],
/* A List of chain objects. */
  evolvesTo: List[EvolutionChainLink])

object EvolutionChainLink {
  import DateTimeCodecs._

  implicit val EvolutionChainLinkCodecJson: CodecJson[EvolutionChainLink] = CodecJson.derive[EvolutionChainLink]
  implicit val EvolutionChainLinkDecoder: EntityDecoder[EvolutionChainLink] = jsonOf[EvolutionChainLink]
  implicit val EvolutionChainLinkEncoder: EntityEncoder[EvolutionChainLink] = jsonEncoderOf[EvolutionChainLink]
}
