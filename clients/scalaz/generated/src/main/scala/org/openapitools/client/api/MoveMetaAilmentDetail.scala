package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaAilmentDetail._

case class MoveMetaAilmentDetail (
  id: Integer,
name: String,
moves: List[AbilityDetailPokemonInnerPokemon],
names: List[MoveMetaAilmentName])

object MoveMetaAilmentDetail {
  import DateTimeCodecs._

  implicit val MoveMetaAilmentDetailCodecJson: CodecJson[MoveMetaAilmentDetail] = CodecJson.derive[MoveMetaAilmentDetail]
  implicit val MoveMetaAilmentDetailDecoder: EntityDecoder[MoveMetaAilmentDetail] = jsonOf[MoveMetaAilmentDetail]
  implicit val MoveMetaAilmentDetailEncoder: EntityEncoder[MoveMetaAilmentDetail] = jsonEncoderOf[MoveMetaAilmentDetail]
}
