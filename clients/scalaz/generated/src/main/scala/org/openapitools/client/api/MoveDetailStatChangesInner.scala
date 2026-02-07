package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailStatChangesInner._

case class MoveDetailStatChangesInner (
  change: Integer,
stat: AbilityDetailPokemonInnerPokemon)

object MoveDetailStatChangesInner {
  import DateTimeCodecs._

  implicit val MoveDetailStatChangesInnerCodecJson: CodecJson[MoveDetailStatChangesInner] = CodecJson.derive[MoveDetailStatChangesInner]
  implicit val MoveDetailStatChangesInnerDecoder: EntityDecoder[MoveDetailStatChangesInner] = jsonOf[MoveDetailStatChangesInner]
  implicit val MoveDetailStatChangesInnerEncoder: EntityEncoder[MoveDetailStatChangesInner] = jsonEncoderOf[MoveDetailStatChangesInner]
}
