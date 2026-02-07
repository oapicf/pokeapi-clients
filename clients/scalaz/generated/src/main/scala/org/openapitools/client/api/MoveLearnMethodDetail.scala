package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveLearnMethodDetail._

case class MoveLearnMethodDetail (
  id: Integer,
name: String,
names: List[MoveLearnMethodName],
descriptions: List[MoveLearnMethodDescription],
versionGroups: List[AbilityDetailPokemonInnerPokemon])

object MoveLearnMethodDetail {
  import DateTimeCodecs._

  implicit val MoveLearnMethodDetailCodecJson: CodecJson[MoveLearnMethodDetail] = CodecJson.derive[MoveLearnMethodDetail]
  implicit val MoveLearnMethodDetailDecoder: EntityDecoder[MoveLearnMethodDetail] = jsonOf[MoveLearnMethodDetail]
  implicit val MoveLearnMethodDetailEncoder: EntityEncoder[MoveLearnMethodDetail] = jsonEncoderOf[MoveLearnMethodDetail]
}
