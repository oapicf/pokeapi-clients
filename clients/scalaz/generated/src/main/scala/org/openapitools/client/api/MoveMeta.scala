package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveMeta._

case class MoveMeta (
  ailment: MoveMetaAilmentSummary,
category: MoveMetaCategorySummary,
minHits: Option[Integer],
maxHits: Option[Integer],
minTurns: Option[Integer],
maxTurns: Option[Integer],
drain: Option[Integer],
healing: Option[Integer],
critRate: Option[Integer],
ailmentChance: Option[Integer],
flinchChance: Option[Integer],
statChance: Option[Integer])

object MoveMeta {
  import DateTimeCodecs._

  implicit val MoveMetaCodecJson: CodecJson[MoveMeta] = CodecJson.derive[MoveMeta]
  implicit val MoveMetaDecoder: EntityDecoder[MoveMeta] = jsonOf[MoveMeta]
  implicit val MoveMetaEncoder: EntityEncoder[MoveMeta] = jsonEncoderOf[MoveMeta]
}
