package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveEffectChange._

case class MoveEffectChange (
  /* The version group in which the previous effect of this ability originated. */
  versionGroup: VersionGroupSummary,
/* The previous effect of this ability listed in different languages. */
  effectEntries: List[MoveEffectChangeEffectText])

object MoveEffectChange {
  import DateTimeCodecs._

  implicit val MoveEffectChangeCodecJson: CodecJson[MoveEffectChange] = CodecJson.derive[MoveEffectChange]
  implicit val MoveEffectChangeDecoder: EntityDecoder[MoveEffectChange] = jsonOf[MoveEffectChange]
  implicit val MoveEffectChangeEncoder: EntityEncoder[MoveEffectChange] = jsonEncoderOf[MoveEffectChange]
}
