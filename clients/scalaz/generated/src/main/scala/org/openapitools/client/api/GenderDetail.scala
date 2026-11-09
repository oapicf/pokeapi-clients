package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderDetail._

case class GenderDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of Pokémon species that can be this gender and how likely it is that they will be. */
  pokemonSpeciesDetails: List[GenderPokemonSpecies],
/* A list of Pokémon species that required this gender in order for a Pokémon to evolve into them. */
  requiredForEvolution: List[PokemonSpeciesSummary])

object GenderDetail {
  import DateTimeCodecs._

  implicit val GenderDetailCodecJson: CodecJson[GenderDetail] = CodecJson.derive[GenderDetail]
  implicit val GenderDetailDecoder: EntityDecoder[GenderDetail] = jsonOf[GenderDetail]
  implicit val GenderDetailEncoder: EntityEncoder[GenderDetail] = jsonEncoderOf[GenderDetail]
}
