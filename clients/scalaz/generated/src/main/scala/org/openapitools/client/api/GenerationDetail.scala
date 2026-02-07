package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerationDetail._

case class GenerationDetail (
  id: Integer,
name: String,
abilities: List[AbilitySummary],
mainRegion: RegionSummary,
moves: List[MoveSummary],
names: List[GenerationName],
pokemonSpecies: List[PokemonSpeciesSummary],
types: List[TypeSummary],
versionGroups: List[VersionGroupSummary])

object GenerationDetail {
  import DateTimeCodecs._

  implicit val GenerationDetailCodecJson: CodecJson[GenerationDetail] = CodecJson.derive[GenerationDetail]
  implicit val GenerationDetailDecoder: EntityDecoder[GenerationDetail] = jsonOf[GenerationDetail]
  implicit val GenerationDetailEncoder: EntityEncoder[GenerationDetail] = jsonEncoderOf[GenerationDetail]
}
