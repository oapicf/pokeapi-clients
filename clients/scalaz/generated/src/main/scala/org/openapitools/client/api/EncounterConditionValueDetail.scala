package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionValueDetail._

case class EncounterConditionValueDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The condition this encounter condition value pertains to. */
  condition: EncounterConditionSummary,
/* The name of this resource listed in different languages. */
  names: List[EncounterConditionValueName])

object EncounterConditionValueDetail {
  import DateTimeCodecs._

  implicit val EncounterConditionValueDetailCodecJson: CodecJson[EncounterConditionValueDetail] = CodecJson.derive[EncounterConditionValueDetail]
  implicit val EncounterConditionValueDetailDecoder: EntityDecoder[EncounterConditionValueDetail] = jsonOf[EncounterConditionValueDetail]
  implicit val EncounterConditionValueDetailEncoder: EntityEncoder[EncounterConditionValueDetail] = jsonEncoderOf[EncounterConditionValueDetail]
}
