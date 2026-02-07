package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokedexDetail._

case class PokedexDetail (
  id: Integer,
name: String,
isMainSeries: Option[Boolean],
descriptions: List[PokedexDescription],
names: List[PokedexName],
pokemonEntries: List[PokedexDetailPokemonEntriesInner],
region: RegionSummary,
versionGroups: List[AbilityDetailPokemonInnerPokemon])

object PokedexDetail {
  import DateTimeCodecs._

  implicit val PokedexDetailCodecJson: CodecJson[PokedexDetail] = CodecJson.derive[PokedexDetail]
  implicit val PokedexDetailDecoder: EntityDecoder[PokedexDetail] = jsonOf[PokedexDetail]
  implicit val PokedexDetailEncoder: EntityEncoder[PokedexDetail] = jsonEncoderOf[PokedexDetail]
}
