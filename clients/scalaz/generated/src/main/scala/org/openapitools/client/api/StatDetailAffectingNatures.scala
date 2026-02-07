package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatDetailAffectingNatures._

case class StatDetailAffectingNatures (
  increase: List[AbilityDetailPokemonInnerPokemon],
decrease: List[AbilityDetailPokemonInnerPokemon])

object StatDetailAffectingNatures {
  import DateTimeCodecs._

  implicit val StatDetailAffectingNaturesCodecJson: CodecJson[StatDetailAffectingNatures] = CodecJson.derive[StatDetailAffectingNatures]
  implicit val StatDetailAffectingNaturesDecoder: EntityDecoder[StatDetailAffectingNatures] = jsonOf[StatDetailAffectingNatures]
  implicit val StatDetailAffectingNaturesEncoder: EntityEncoder[StatDetailAffectingNatures] = jsonEncoderOf[StatDetailAffectingNatures]
}
