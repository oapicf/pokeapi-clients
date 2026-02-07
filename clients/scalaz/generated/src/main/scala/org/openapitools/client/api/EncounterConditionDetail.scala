package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionDetail._

case class EncounterConditionDetail (
  id: Integer,
name: String,
values: List[EncounterConditionValueSummary],
names: List[EncounterConditionName])

object EncounterConditionDetail {
  import DateTimeCodecs._

  implicit val EncounterConditionDetailCodecJson: CodecJson[EncounterConditionDetail] = CodecJson.derive[EncounterConditionDetail]
  implicit val EncounterConditionDetailDecoder: EntityDecoder[EncounterConditionDetail] = jsonOf[EncounterConditionDetail]
  implicit val EncounterConditionDetailEncoder: EntityEncoder[EncounterConditionDetail] = jsonEncoderOf[EncounterConditionDetail]
}
