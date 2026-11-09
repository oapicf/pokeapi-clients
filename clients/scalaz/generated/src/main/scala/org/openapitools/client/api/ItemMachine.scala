package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemMachine._

case class ItemMachine (
  /* The machine that teaches a move from an item. */
  machine: MachineSummary,
/* The version group of this specific machine. */
  versionGroup: VersionGroupSummary)

object ItemMachine {
  import DateTimeCodecs._

  implicit val ItemMachineCodecJson: CodecJson[ItemMachine] = CodecJson.derive[ItemMachine]
  implicit val ItemMachineDecoder: EntityDecoder[ItemMachine] = jsonOf[ItemMachine]
  implicit val ItemMachineEncoder: EntityEncoder[ItemMachine] = jsonEncoderOf[ItemMachine]
}
