package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterMethodDetail._

case class EncounterMethodDetail (
  id: Integer,
name: String,
order: Option[Integer],
names: List[EncounterMethodName])

object EncounterMethodDetail {
  import DateTimeCodecs._

  implicit val EncounterMethodDetailCodecJson: CodecJson[EncounterMethodDetail] = CodecJson.derive[EncounterMethodDetail]
  implicit val EncounterMethodDetailDecoder: EntityDecoder[EncounterMethodDetail] = jsonOf[EncounterMethodDetail]
  implicit val EncounterMethodDetailEncoder: EntityEncoder[EncounterMethodDetail] = jsonEncoderOf[EncounterMethodDetail]
}
