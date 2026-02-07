package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityName._

case class AbilityName (
  name: String,
language: LanguageSummary)

object AbilityName {
  import DateTimeCodecs._

  implicit val AbilityNameCodecJson: CodecJson[AbilityName] = CodecJson.derive[AbilityName]
  implicit val AbilityNameDecoder: EntityDecoder[AbilityName] = jsonOf[AbilityName]
  implicit val AbilityNameEncoder: EntityEncoder[AbilityName] = jsonEncoderOf[AbilityName]
}
