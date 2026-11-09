package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionDetail._

case class EncounterConditionDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* A list of possible values for this encounter condition. */
  values: List[EncounterConditionValueSummary],
/* The name of this resource listed in different languages. */
  names: List[EncounterConditionName])

object EncounterConditionDetail {
  import DateTimeCodecs._

  implicit val EncounterConditionDetailCodecJson: CodecJson[EncounterConditionDetail] = CodecJson.derive[EncounterConditionDetail]
  implicit val EncounterConditionDetailDecoder: EntityDecoder[EncounterConditionDetail] = jsonOf[EncounterConditionDetail]
  implicit val EncounterConditionDetailEncoder: EntityEncoder[EncounterConditionDetail] = jsonEncoderOf[EncounterConditionDetail]
}
