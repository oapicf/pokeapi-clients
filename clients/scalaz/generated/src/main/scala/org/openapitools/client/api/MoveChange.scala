package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveChange._

case class MoveChange (
  /* The percent value of how likely this move is to be successful. */
  accuracy: Option[Integer],
/* The base power before the listed version group, or null if power did not change. */
  power: Option[Integer],
/* Power points. The number of times this move can be used. */
  pp: Option[Integer],
/* The percent value of how likely it is this moves effect will take effect. */
  effectChance: Integer,
/* The effect of this move listed in different languages. */
  effectEntries: List[MoveEffectEffectText],
/* The elemental type of this move. */
  `type`: TypeSummary,
/* The version group in which these move stat values were in effect. */
  versionGroup: VersionGroupSummary)

object MoveChange {
  import DateTimeCodecs._

  implicit val MoveChangeCodecJson: CodecJson[MoveChange] = CodecJson.derive[MoveChange]
  implicit val MoveChangeDecoder: EntityDecoder[MoveChange] = jsonOf[MoveChange]
  implicit val MoveChangeEncoder: EntityEncoder[MoveChange] = jsonEncoderOf[MoveChange]
}
