package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetailContestCombosNormal._

case class MoveDetailContestCombosNormal (
  useBefore: List[AbilityDetailPokemonInnerPokemon],
useAfter: List[AbilityDetailPokemonInnerPokemon])

object MoveDetailContestCombosNormal {
  import DateTimeCodecs._

  implicit val MoveDetailContestCombosNormalCodecJson: CodecJson[MoveDetailContestCombosNormal] = CodecJson.derive[MoveDetailContestCombosNormal]
  implicit val MoveDetailContestCombosNormalDecoder: EntityDecoder[MoveDetailContestCombosNormal] = jsonOf[MoveDetailContestCombosNormal]
  implicit val MoveDetailContestCombosNormalEncoder: EntityEncoder[MoveDetailContestCombosNormal] = jsonEncoderOf[MoveDetailContestCombosNormal]
}
