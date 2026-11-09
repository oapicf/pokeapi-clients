package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param accuracy The percent value of how likely this move is to be successful. for example: ''null''
 * @param effectChance The percent value of how likely it is this moves effect will happen. for example: ''null''
 * @param pp Power points. The number of times this move can be used. for example: ''null''
 * @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. for example: ''null''
 * @param power The base power of this move, or null if it has no fixed base power. for example: ''null''
 * @param contestCombos A detail of normal and super contest combos that require this move. for example: ''null''
 * @param contestType The type of appeal this move gives a Pokémon when used in a contest. for example: ''null''
 * @param contestEffect The effect the move has when used in a contest. for example: ''null''
 * @param damageClass The type of damage the move inflicts on the target, e.g. physical. for example: ''null''
 * @param effectEntries The effect of this move listed in different languages. for example: ''null''
 * @param effectChanges The list of previous effects this move has had across version groups of the games. for example: ''null''
 * @param generation The generation in which this move was introduced. for example: ''null''
 * @param meta Metadata about this move for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pastValues A list of move resource value changes across version groups of the game. for example: ''null''
 * @param statChanges A list of stats this moves effects and how much it effects them. for example: ''null''
 * @param superContestEffect The effect the move has when used in a super contest. for example: ''null''
 * @param target The type of target that will receive the effects of the attack. for example: ''null''
 * @param `type` The elemental type of this move. for example: ''null''
 * @param machines A list of the machines that teach this move. for example: ''null''
 * @param flavorTextEntries The flavor text of this move listed in different languages. for example: ''null''
 * @param learnedByPokemon List of Pokemon that can learn the move for example: ''null''
*/
final case class MoveDetail (
  id: Int,
  name: String,
  accuracy: Option[Int] = None,
  effectChance: Int,
  pp: Option[Int] = None,
  priority: Option[Int] = None,
  power: Option[Int] = None,
  contestCombos: MoveCombos,
  contestType: ContestTypeSummary,
  contestEffect: ContestEffectSummary,
  damageClass: MoveDamageClassSummary,
  effectEntries: Seq[MoveEffectEffectText],
  effectChanges: Seq[MoveEffectChange],
  generation: GenerationSummary,
  meta: MoveMeta,
  names: Seq[MoveName],
  pastValues: Seq[MoveChange],
  statChanges: Seq[MoveMetaStatChange],
  superContestEffect: SuperContestEffectSummary,
  target: MoveTargetSummary,
  `type`: TypeSummary,
  machines: Seq[ItemMachine],
  flavorTextEntries: Seq[MoveFlavorText],
  learnedByPokemon: Seq[PokemonSummary]
)

