package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMetaCategoryDetail._

case class MoveMetaCategoryDetail (
  id: Integer,
name: String,
descriptions: List[MoveMetaCategoryDescription],
moves: List[AbilityDetailPokemonInnerPokemon])

object MoveMetaCategoryDetail {
  import DateTimeCodecs._

  implicit val MoveMetaCategoryDetailCodecJson: CodecJson[MoveMetaCategoryDetail] = CodecJson.derive[MoveMetaCategoryDetail]
  implicit val MoveMetaCategoryDetailDecoder: EntityDecoder[MoveMetaCategoryDetail] = jsonOf[MoveMetaCategoryDetail]
  implicit val MoveMetaCategoryDetailEncoder: EntityEncoder[MoveMetaCategoryDetail] = jsonEncoderOf[MoveMetaCategoryDetail]
}
