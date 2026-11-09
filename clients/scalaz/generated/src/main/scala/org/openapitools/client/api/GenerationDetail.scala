package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenerationDetail._

case class GenerationDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of abilities that were introduced in this generation. */
  abilities: List[AbilitySummary],
/* The main region travelled in this generation. */
  mainRegion: RegionSummary,
/* A list of moves that were introduced in this generation. */
  moves: List[MoveSummary],
/* The name of this resource listed in different languages. */
  names: List[GenerationName],
/* A list of Pokémon species that were introduced in this generation. */
  pokemonSpecies: List[PokemonSpeciesSummary],
/* A list of types that were introduced in this generation. */
  types: List[TypeSummary],
/* A list of version groups that were introduced in this generation. */
  versionGroups: List[VersionGroupSummary])

object GenerationDetail {
  import DateTimeCodecs._

  implicit val GenerationDetailCodecJson: CodecJson[GenerationDetail] = CodecJson.derive[GenerationDetail]
  implicit val GenerationDetailDecoder: EntityDecoder[GenerationDetail] = jsonOf[GenerationDetail]
  implicit val GenerationDetailEncoder: EntityEncoder[GenerationDetail] = jsonEncoderOf[GenerationDetail]
}
