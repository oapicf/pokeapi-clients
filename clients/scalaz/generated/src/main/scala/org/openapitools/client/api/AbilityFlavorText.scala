package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityFlavorText._

case class AbilityFlavorText (
  flavorText: String,
language: LanguageSummary,
versionGroup: VersionGroupSummary)

object AbilityFlavorText {
  import DateTimeCodecs._

  implicit val AbilityFlavorTextCodecJson: CodecJson[AbilityFlavorText] = CodecJson.derive[AbilityFlavorText]
  implicit val AbilityFlavorTextDecoder: EntityDecoder[AbilityFlavorText] = jsonOf[AbilityFlavorText]
  implicit val AbilityFlavorTextEncoder: EntityEncoder[AbilityFlavorText] = jsonEncoderOf[AbilityFlavorText]
}
