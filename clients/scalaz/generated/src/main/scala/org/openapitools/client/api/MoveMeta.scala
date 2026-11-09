package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMeta._

case class MoveMeta (
  /* The status ailment this move inflicts on its target. */
  ailment: MoveMetaAilmentSummary,
/* The category of move this move falls under, e.g. damage or ailment. */
  category: MoveMetaCategorySummary,
/* The minimum number of times this move hits. Null if it always only hits once. */
  minHits: Option[Integer],
/* The maximum number of times this move hits. Null if it always only hits once. */
  maxHits: Option[Integer],
/* The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. */
  minTurns: Option[Integer],
/* The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. */
  maxTurns: Option[Integer],
/* HP drain (if positive) or Recoil damage (if negative), in percent of damage done. */
  drain: Option[Integer],
/* The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. */
  healing: Option[Integer],
/* Critical hit rate bonus. */
  critRate: Option[Integer],
/* The likelihood this attack will cause an ailment. */
  ailmentChance: Option[Integer],
/* The likelihood this attack will cause the target Pokémon to flinch. */
  flinchChance: Option[Integer],
/* The likelihood this attack will cause a stat change in the target Pokémon. */
  statChance: Option[Integer])

object MoveMeta {
  import DateTimeCodecs._

  implicit val MoveMetaCodecJson: CodecJson[MoveMeta] = CodecJson.derive[MoveMeta]
  implicit val MoveMetaDecoder: EntityDecoder[MoveMeta] = jsonOf[MoveMeta]
  implicit val MoveMetaEncoder: EntityEncoder[MoveMeta] = jsonEncoderOf[MoveMeta]
}
