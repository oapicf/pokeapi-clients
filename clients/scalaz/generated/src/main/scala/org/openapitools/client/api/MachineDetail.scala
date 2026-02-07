package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MachineDetail._

case class MachineDetail (
  id: Integer,
item: ItemSummary,
versionGroup: VersionGroupSummary,
move: MoveSummary)

object MachineDetail {
  import DateTimeCodecs._

  implicit val MachineDetailCodecJson: CodecJson[MachineDetail] = CodecJson.derive[MachineDetail]
  implicit val MachineDetailDecoder: EntityDecoder[MachineDetail] = jsonOf[MachineDetail]
  implicit val MachineDetailEncoder: EntityEncoder[MachineDetail] = jsonEncoderOf[MachineDetail]
}
