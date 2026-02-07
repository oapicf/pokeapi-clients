package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NatureDetailPokeathlonStatChangesInner._

case class NatureDetailPokeathlonStatChangesInner (
  maxChange: Integer,
pokeathlonStat: AbilityDetailPokemonInnerPokemon)

object NatureDetailPokeathlonStatChangesInner {
  import DateTimeCodecs._

  implicit val NatureDetailPokeathlonStatChangesInnerCodecJson: CodecJson[NatureDetailPokeathlonStatChangesInner] = CodecJson.derive[NatureDetailPokeathlonStatChangesInner]
  implicit val NatureDetailPokeathlonStatChangesInnerDecoder: EntityDecoder[NatureDetailPokeathlonStatChangesInner] = jsonOf[NatureDetailPokeathlonStatChangesInner]
  implicit val NatureDetailPokeathlonStatChangesInnerEncoder: EntityEncoder[NatureDetailPokeathlonStatChangesInner] = jsonEncoderOf[NatureDetailPokeathlonStatChangesInner]
}
