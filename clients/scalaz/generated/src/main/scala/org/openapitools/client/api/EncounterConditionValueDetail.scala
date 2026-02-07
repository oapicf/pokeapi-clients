package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionValueDetail._

case class EncounterConditionValueDetail (
  id: Integer,
name: String,
condition: EncounterConditionSummary,
names: List[EncounterConditionValueName])

object EncounterConditionValueDetail {
  import DateTimeCodecs._

  implicit val EncounterConditionValueDetailCodecJson: CodecJson[EncounterConditionValueDetail] = CodecJson.derive[EncounterConditionValueDetail]
  implicit val EncounterConditionValueDetailDecoder: EntityDecoder[EncounterConditionValueDetail] = jsonOf[EncounterConditionValueDetail]
  implicit val EncounterConditionValueDetailEncoder: EntityEncoder[EncounterConditionValueDetail] = jsonEncoderOf[EncounterConditionValueDetail]
}
