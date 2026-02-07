package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatDetailAffectingNaturesIncreaseInner._

case class PokeathlonStatDetailAffectingNaturesIncreaseInner (
  maxChange: Integer,
nature: AbilityDetailPokemonInnerPokemon)

object PokeathlonStatDetailAffectingNaturesIncreaseInner {
  import DateTimeCodecs._

  implicit val PokeathlonStatDetailAffectingNaturesIncreaseInnerCodecJson: CodecJson[PokeathlonStatDetailAffectingNaturesIncreaseInner] = CodecJson.derive[PokeathlonStatDetailAffectingNaturesIncreaseInner]
  implicit val PokeathlonStatDetailAffectingNaturesIncreaseInnerDecoder: EntityDecoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = jsonOf[PokeathlonStatDetailAffectingNaturesIncreaseInner]
  implicit val PokeathlonStatDetailAffectingNaturesIncreaseInnerEncoder: EntityEncoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = jsonEncoderOf[PokeathlonStatDetailAffectingNaturesIncreaseInner]
}
