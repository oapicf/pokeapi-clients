package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokeathlonStatDetailAffectingNaturesDecreaseInner._

case class PokeathlonStatDetailAffectingNaturesDecreaseInner (
  maxChange: Integer,
nature: AbilityDetailPokemonInnerPokemon)

object PokeathlonStatDetailAffectingNaturesDecreaseInner {
  import DateTimeCodecs._

  implicit val PokeathlonStatDetailAffectingNaturesDecreaseInnerCodecJson: CodecJson[PokeathlonStatDetailAffectingNaturesDecreaseInner] = CodecJson.derive[PokeathlonStatDetailAffectingNaturesDecreaseInner]
  implicit val PokeathlonStatDetailAffectingNaturesDecreaseInnerDecoder: EntityDecoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = jsonOf[PokeathlonStatDetailAffectingNaturesDecreaseInner]
  implicit val PokeathlonStatDetailAffectingNaturesDecreaseInnerEncoder: EntityEncoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = jsonEncoderOf[PokeathlonStatDetailAffectingNaturesDecreaseInner]
}
