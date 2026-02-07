package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GrowthRateDetail._

case class GrowthRateDetail (
  id: Integer,
name: String,
formula: String,
descriptions: List[GrowthRateDescription],
levels: List[Experience],
pokemonSpecies: List[PokemonSpeciesSummary])

object GrowthRateDetail {
  import DateTimeCodecs._

  implicit val GrowthRateDetailCodecJson: CodecJson[GrowthRateDetail] = CodecJson.derive[GrowthRateDetail]
  implicit val GrowthRateDetailDecoder: EntityDecoder[GrowthRateDetail] = jsonOf[GrowthRateDetail]
  implicit val GrowthRateDetailEncoder: EntityEncoder[GrowthRateDetail] = jsonEncoderOf[GrowthRateDetail]
}
