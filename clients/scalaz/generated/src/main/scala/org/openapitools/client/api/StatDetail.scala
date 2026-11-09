package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StatDetail._

case class StatDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* ID the games use for this stat. */
  gameIndex: Integer,
/* Whether this stat only exists within a battle. */
  isBattleOnly: Option[Boolean],
/* A detail of moves which affect this stat positively or negatively. */
  affectingMoves: StatAffectingMoves,
/* A detail of natures which affect this stat positively or negatively. */
  affectingNatures: StatAffectingNatures,
/* Items that affect this stat, such as vitamins and battle items. */
  affectingItems: List[ItemSummary],
/* A list of characteristics that are set on a Pokémon when its highest base stat is this stat. */
  characteristics: List[CharacteristicSummary],
/* The class of damage this stat is directly related to. */
  moveDamageClass: MoveDamageClassSummary,
/* The name of this resource listed in different languages. */
  names: List[StatName])

object StatDetail {
  import DateTimeCodecs._

  implicit val StatDetailCodecJson: CodecJson[StatDetail] = CodecJson.derive[StatDetail]
  implicit val StatDetailDecoder: EntityDecoder[StatDetail] = jsonOf[StatDetail]
  implicit val StatDetailEncoder: EntityEncoder[StatDetail] = jsonEncoderOf[StatDetail]
}
