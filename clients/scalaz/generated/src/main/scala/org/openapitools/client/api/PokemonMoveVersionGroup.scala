package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PokemonMoveVersionGroup._

case class PokemonMoveVersionGroup (
  /* The minimum level to learn the move. */
  levelLearnedAt: Integer,
/* The method by which the move is learned. */
  moveLearnMethod: MoveLearnMethodSummary,
/* The version group in which the move is learned. */
  versionGroup: VersionGroupSummary,
/* Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. */
  order: Option[Integer])

object PokemonMoveVersionGroup {
  import DateTimeCodecs._

  implicit val PokemonMoveVersionGroupCodecJson: CodecJson[PokemonMoveVersionGroup] = CodecJson.derive[PokemonMoveVersionGroup]
  implicit val PokemonMoveVersionGroupDecoder: EntityDecoder[PokemonMoveVersionGroup] = jsonOf[PokemonMoveVersionGroup]
  implicit val PokemonMoveVersionGroupEncoder: EntityEncoder[PokemonMoveVersionGroup] = jsonEncoderOf[PokemonMoveVersionGroup]
}
