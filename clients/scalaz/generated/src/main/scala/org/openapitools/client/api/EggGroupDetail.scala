package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EggGroupDetail._

case class EggGroupDetail (
  id: Integer,
name: String,
names: List[EggGroupName],
pokemonSpecies: List[EggGroupDetailPokemonSpeciesInner])

object EggGroupDetail {
  import DateTimeCodecs._

  implicit val EggGroupDetailCodecJson: CodecJson[EggGroupDetail] = CodecJson.derive[EggGroupDetail]
  implicit val EggGroupDetailDecoder: EntityDecoder[EggGroupDetail] = jsonOf[EggGroupDetail]
  implicit val EggGroupDetailEncoder: EntityEncoder[EggGroupDetail] = jsonEncoderOf[EggGroupDetail]
}
