package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param accuracy The percent value of how likely this move is to be successful.
  * @param effectChance The percent value of how likely it is this moves effect will happen.
  * @param pp Power points. The number of times this move can be used.
  * @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
  * @param power The base power of this move, or null if it has no fixed base power.
  * @param contestCombos A detail of normal and super contest combos that require this move.
  * @param contestType The type of appeal this move gives a Pokémon when used in a contest.
  * @param contestEffect The effect the move has when used in a contest.
  * @param damageClass The type of damage the move inflicts on the target, e.g. physical.
  * @param effectEntries The effect of this move listed in different languages.
  * @param effectChanges The list of previous effects this move has had across version groups of the games.
  * @param generation The generation in which this move was introduced.
  * @param meta Metadata about this move
  * @param names The name of this resource listed in different languages.
  * @param pastValues A list of move resource value changes across version groups of the game.
  * @param statChanges A list of stats this moves effects and how much it effects them.
  * @param superContestEffect The effect the move has when used in a super contest.
  * @param target The type of target that will receive the effects of the attack.
  * @param `type` The elemental type of this move.
  * @param machines A list of the machines that teach this move.
  * @param flavorTextEntries The flavor text of this move listed in different languages.
  * @param learnedByPokemon List of Pokemon that can learn the move
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveDetail(
  id: Int,
  name: String,
  accuracy: Option[Int],
  effectChance: Int,
  pp: Option[Int],
  priority: Option[Int],
  power: Option[Int],
  contestCombos: MoveCombos,
  contestType: ContestTypeSummary,
  contestEffect: ContestEffectSummary,
  damageClass: MoveDamageClassSummary,
  effectEntries: List[MoveEffectEffectText],
  effectChanges: List[MoveEffectChange],
  generation: GenerationSummary,
  meta: MoveMeta,
  names: List[MoveName],
  pastValues: List[MoveChange],
  statChanges: List[MoveMetaStatChange],
  superContestEffect: SuperContestEffectSummary,
  target: MoveTargetSummary,
  `type`: TypeSummary,
  machines: List[ItemMachine],
  flavorTextEntries: List[MoveFlavorText],
  learnedByPokemon: List[PokemonSummary]
)

object MoveDetail {
  implicit lazy val moveDetailJsonFormat: Format[MoveDetail] = Json.format[MoveDetail]
}

