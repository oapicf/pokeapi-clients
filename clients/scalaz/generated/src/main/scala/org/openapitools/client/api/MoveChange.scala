package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveChange._

case class MoveChange (
  accuracy: Option[Integer],
power: Option[Integer],
pp: Option[Integer],
effectChance: Integer,
effectEntries: List[MoveChangeEffectEntriesInner],
`type`: TypeSummary,
versionGroup: VersionGroupSummary)

object MoveChange {
  import DateTimeCodecs._

  implicit val MoveChangeCodecJson: CodecJson[MoveChange] = CodecJson.derive[MoveChange]
  implicit val MoveChangeDecoder: EntityDecoder[MoveChange] = jsonOf[MoveChange]
  implicit val MoveChangeEncoder: EntityEncoder[MoveChange] = jsonEncoderOf[MoveChange]
}
