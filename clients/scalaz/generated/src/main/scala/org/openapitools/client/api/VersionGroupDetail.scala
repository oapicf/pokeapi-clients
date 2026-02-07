package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionGroupDetail._

case class VersionGroupDetail (
  id: Integer,
name: String,
order: Option[Integer],
generation: GenerationSummary,
moveLearnMethods: List[AbilityDetailPokemonInnerPokemon],
pokedexes: List[AbilityDetailPokemonInnerPokemon],
regions: List[AbilityDetailPokemonInnerPokemon],
versions: List[VersionSummary])

object VersionGroupDetail {
  import DateTimeCodecs._

  implicit val VersionGroupDetailCodecJson: CodecJson[VersionGroupDetail] = CodecJson.derive[VersionGroupDetail]
  implicit val VersionGroupDetailDecoder: EntityDecoder[VersionGroupDetail] = jsonOf[VersionGroupDetail]
  implicit val VersionGroupDetailEncoder: EntityEncoder[VersionGroupDetail] = jsonEncoderOf[VersionGroupDetail]
}
