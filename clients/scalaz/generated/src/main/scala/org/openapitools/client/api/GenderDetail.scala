package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderDetail._

case class GenderDetail (
  id: Integer,
name: String,
pokemonSpeciesDetails: List[GenderDetailPokemonSpeciesDetailsInner],
requiredForEvolution: List[AbilityDetailPokemonInnerPokemon])

object GenderDetail {
  import DateTimeCodecs._

  implicit val GenderDetailCodecJson: CodecJson[GenderDetail] = CodecJson.derive[GenderDetail]
  implicit val GenderDetailDecoder: EntityDecoder[GenderDetail] = jsonOf[GenderDetail]
  implicit val GenderDetailEncoder: EntityEncoder[GenderDetail] = jsonEncoderOf[GenderDetail]
}
