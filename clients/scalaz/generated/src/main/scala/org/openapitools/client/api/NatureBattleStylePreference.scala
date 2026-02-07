package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NatureBattleStylePreference._

case class NatureBattleStylePreference (
  lowHpPreference: Integer,
highHpPreference: Integer,
moveBattleStyle: MoveBattleStyleSummary)

object NatureBattleStylePreference {
  import DateTimeCodecs._

  implicit val NatureBattleStylePreferenceCodecJson: CodecJson[NatureBattleStylePreference] = CodecJson.derive[NatureBattleStylePreference]
  implicit val NatureBattleStylePreferenceDecoder: EntityDecoder[NatureBattleStylePreference] = jsonOf[NatureBattleStylePreference]
  implicit val NatureBattleStylePreferenceEncoder: EntityEncoder[NatureBattleStylePreference] = jsonEncoderOf[NatureBattleStylePreference]
}
