package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RegionDetail._

case class RegionDetail (
  id: Integer,
name: String,
locations: List[LocationSummary],
mainGeneration: GenerationSummary,
names: List[RegionName],
pokedexes: List[PokedexSummary],
versionGroups: List[AbilityDetailPokemonInnerPokemon])

object RegionDetail {
  import DateTimeCodecs._

  implicit val RegionDetailCodecJson: CodecJson[RegionDetail] = CodecJson.derive[RegionDetail]
  implicit val RegionDetailDecoder: EntityDecoder[RegionDetail] = jsonOf[RegionDetail]
  implicit val RegionDetailEncoder: EntityEncoder[RegionDetail] = jsonEncoderOf[RegionDetail]
}
