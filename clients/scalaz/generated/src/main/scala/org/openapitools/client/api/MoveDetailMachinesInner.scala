package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailMachinesInner._

case class MoveDetailMachinesInner (
  machine: MoveDetailMachinesInnerMachine,
versionGroup: AbilityDetailPokemonInnerPokemon)

object MoveDetailMachinesInner {
  import DateTimeCodecs._

  implicit val MoveDetailMachinesInnerCodecJson: CodecJson[MoveDetailMachinesInner] = CodecJson.derive[MoveDetailMachinesInner]
  implicit val MoveDetailMachinesInnerDecoder: EntityDecoder[MoveDetailMachinesInner] = jsonOf[MoveDetailMachinesInner]
  implicit val MoveDetailMachinesInnerEncoder: EntityEncoder[MoveDetailMachinesInner] = jsonEncoderOf[MoveDetailMachinesInner]
}
