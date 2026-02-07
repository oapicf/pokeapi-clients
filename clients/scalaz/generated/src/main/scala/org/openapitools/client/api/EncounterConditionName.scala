package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EncounterConditionName._

case class EncounterConditionName (
  name: String,
language: LanguageSummary)

object EncounterConditionName {
  import DateTimeCodecs._

  implicit val EncounterConditionNameCodecJson: CodecJson[EncounterConditionName] = CodecJson.derive[EncounterConditionName]
  implicit val EncounterConditionNameDecoder: EntityDecoder[EncounterConditionName] = jsonOf[EncounterConditionName]
  implicit val EncounterConditionNameEncoder: EntityEncoder[EncounterConditionName] = jsonEncoderOf[EncounterConditionName]
}
