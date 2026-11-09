package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GrowthRateDetail._

case class GrowthRateDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The formula used to calculate the rate at which the Pokémon species gains level. */
  formula: String,
/* The descriptions of this characteristic listed in different languages. */
  descriptions: List[GrowthRateDescription],
/* A list of levels and the amount of experienced needed to atain them based on this growth rate. */
  levels: List[Experience],
/* A list of Pokémon species that gain levels at this growth rate. */
  pokemonSpecies: List[PokemonSpeciesSummary])

object GrowthRateDetail {
  import DateTimeCodecs._

  implicit val GrowthRateDetailCodecJson: CodecJson[GrowthRateDetail] = CodecJson.derive[GrowthRateDetail]
  implicit val GrowthRateDetailDecoder: EntityDecoder[GrowthRateDetail] = jsonOf[GrowthRateDetail]
  implicit val GrowthRateDetailEncoder: EntityEncoder[GrowthRateDetail] = jsonEncoderOf[GrowthRateDetail]
}
