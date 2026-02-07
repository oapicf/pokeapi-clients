package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionValueName._

case class EncounterConditionValueName (
  name: String,
language: LanguageSummary)

object EncounterConditionValueName {
  import DateTimeCodecs._

  implicit val EncounterConditionValueNameCodecJson: CodecJson[EncounterConditionValueName] = CodecJson.derive[EncounterConditionValueName]
  implicit val EncounterConditionValueNameDecoder: EntityDecoder[EncounterConditionValueName] = jsonOf[EncounterConditionValueName]
  implicit val EncounterConditionValueNameEncoder: EntityEncoder[EncounterConditionValueName] = jsonEncoderOf[EncounterConditionValueName]
}
