package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MachineDetail._

case class MachineDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The TM or HM item that corresponds to this machine. */
  item: ItemSummary,
/* The version group that this machine applies to. */
  versionGroup: VersionGroupSummary,
/* The move that is taught by this machine. */
  move: MoveSummary)

object MachineDetail {
  import DateTimeCodecs._

  implicit val MachineDetailCodecJson: CodecJson[MachineDetail] = CodecJson.derive[MachineDetail]
  implicit val MachineDetailDecoder: EntityDecoder[MachineDetail] = jsonOf[MachineDetail]
  implicit val MachineDetailEncoder: EntityEncoder[MachineDetail] = jsonEncoderOf[MachineDetail]
}
