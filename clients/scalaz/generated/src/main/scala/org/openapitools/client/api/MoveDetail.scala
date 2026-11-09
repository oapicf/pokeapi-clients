package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MoveDetail._

case class MoveDetail (
  /* The identifier for this resource. */
  id: Integer,
/* The name for this resource. */
  name: String,
/* The percent value of how likely this move is to be successful. */
  accuracy: Option[Integer],
/* The percent value of how likely it is this moves effect will happen. */
  effectChance: Integer,
/* Power points. The number of times this move can be used. */
  pp: Option[Integer],
/* A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. */
  priority: Option[Integer],
/* The base power of this move, or null if it has no fixed base power. */
  power: Option[Integer],
/* A detail of normal and super contest combos that require this move. */
  contestCombos: MoveCombos,
/* The type of appeal this move gives a Pokémon when used in a contest. */
  contestType: ContestTypeSummary,
/* The effect the move has when used in a contest. */
  contestEffect: ContestEffectSummary,
/* The type of damage the move inflicts on the target, e.g. physical. */
  damageClass: MoveDamageClassSummary,
/* The effect of this move listed in different languages. */
  effectEntries: List[MoveEffectEffectText],
/* The list of previous effects this move has had across version groups of the games. */
  effectChanges: List[MoveEffectChange],
/* The generation in which this move was introduced. */
  generation: GenerationSummary,
/* Metadata about this move */
  meta: MoveMeta,
/* The name of this resource listed in different languages. */
  names: List[MoveName],
/* A list of move resource value changes across version groups of the game. */
  pastValues: List[MoveChange],
/* A list of stats this moves effects and how much it effects them. */
  statChanges: List[MoveMetaStatChange],
/* The effect the move has when used in a super contest. */
  superContestEffect: SuperContestEffectSummary,
/* The type of target that will receive the effects of the attack. */
  target: MoveTargetSummary,
/* The elemental type of this move. */
  `type`: TypeSummary,
/* A list of the machines that teach this move. */
  machines: List[ItemMachine],
/* The flavor text of this move listed in different languages. */
  flavorTextEntries: List[MoveFlavorText],
/* List of Pokemon that can learn the move */
  learnedByPokemon: List[PokemonSummary])

object MoveDetail {
  import DateTimeCodecs._

  implicit val MoveDetailCodecJson: CodecJson[MoveDetail] = CodecJson.derive[MoveDetail]
  implicit val MoveDetailDecoder: EntityDecoder[MoveDetail] = jsonOf[MoveDetail]
  implicit val MoveDetailEncoder: EntityEncoder[MoveDetail] = jsonEncoderOf[MoveDetail]
}
