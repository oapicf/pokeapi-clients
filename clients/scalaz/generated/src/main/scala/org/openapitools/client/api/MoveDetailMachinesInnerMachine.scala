package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI

import MoveDetailMachinesInnerMachine._

case class MoveDetailMachinesInnerMachine (
  url: URI)

object MoveDetailMachinesInnerMachine {
  import DateTimeCodecs._

  implicit val MoveDetailMachinesInnerMachineCodecJson: CodecJson[MoveDetailMachinesInnerMachine] = CodecJson.derive[MoveDetailMachinesInnerMachine]
  implicit val MoveDetailMachinesInnerMachineDecoder: EntityDecoder[MoveDetailMachinesInnerMachine] = jsonOf[MoveDetailMachinesInnerMachine]
  implicit val MoveDetailMachinesInnerMachineEncoder: EntityEncoder[MoveDetailMachinesInnerMachine] = jsonEncoderOf[MoveDetailMachinesInnerMachine]
}
