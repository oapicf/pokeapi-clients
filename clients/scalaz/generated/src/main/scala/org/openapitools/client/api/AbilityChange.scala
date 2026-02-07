package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AbilityChange._

case class AbilityChange (
  versionGroup: VersionGroupSummary,
effectEntries: List[AbilityChangeEffectText])

object AbilityChange {
  import DateTimeCodecs._

  implicit val AbilityChangeCodecJson: CodecJson[AbilityChange] = CodecJson.derive[AbilityChange]
  implicit val AbilityChangeDecoder: EntityDecoder[AbilityChange] = jsonOf[AbilityChange]
  implicit val AbilityChangeEncoder: EntityEncoder[AbilityChange] = jsonEncoderOf[AbilityChange]
}
