
package org.openapitools.client.model


case class MoveDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The percent value of how likely this move is to be successful. */
    _accuracy: Option[Integer],
    /* The percent value of how likely it is this moves effect will happen. */
    _effectChance: Integer,
    /* Power points. The number of times this move can be used. */
    _pp: Option[Integer],
    /* A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. */
    _priority: Option[Integer],
    /* The base power of this move, or null if it has no fixed base power. */
    _power: Option[Integer],
    /* A detail of normal and super contest combos that require this move. */
    _contestCombos: MoveCombos,
    /* The type of appeal this move gives a Pokémon when used in a contest. */
    _contestType: ContestTypeSummary,
    /* The effect the move has when used in a contest. */
    _contestEffect: ContestEffectSummary,
    /* The type of damage the move inflicts on the target, e.g. physical. */
    _damageClass: MoveDamageClassSummary,
    /* The effect of this move listed in different languages. */
    _effectEntries: List[MoveEffectEffectText],
    /* The list of previous effects this move has had across version groups of the games. */
    _effectChanges: List[MoveEffectChange],
    /* The generation in which this move was introduced. */
    _generation: GenerationSummary,
    /* Metadata about this move */
    _meta: MoveMeta,
    /* The name of this resource listed in different languages. */
    _names: List[MoveName],
    /* A list of move resource value changes across version groups of the game. */
    _pastValues: List[MoveChange],
    /* A list of stats this moves effects and how much it effects them. */
    _statChanges: List[MoveMetaStatChange],
    /* The effect the move has when used in a super contest. */
    _superContestEffect: SuperContestEffectSummary,
    /* The type of target that will receive the effects of the attack. */
    _target: MoveTargetSummary,
    /* The elemental type of this move. */
    _type: TypeSummary,
    /* A list of the machines that teach this move. */
    _machines: List[ItemMachine],
    /* The flavor text of this move listed in different languages. */
    _flavorTextEntries: List[MoveFlavorText],
    /* List of Pokemon that can learn the move */
    _learnedByPokemon: List[PokemonSummary]
)
object MoveDetail {
    def toStringBody(var_id: Object, var_name: Object, var_accuracy: Object, var_effectChance: Object, var_pp: Object, var_priority: Object, var_power: Object, var_contestCombos: Object, var_contestType: Object, var_contestEffect: Object, var_damageClass: Object, var_effectEntries: Object, var_effectChanges: Object, var_generation: Object, var_meta: Object, var_names: Object, var_pastValues: Object, var_statChanges: Object, var_superContestEffect: Object, var_target: Object, var_type: Object, var_machines: Object, var_flavorTextEntries: Object, var_learnedByPokemon: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"accuracy":$var_accuracy,"effectChance":$var_effectChance,"pp":$var_pp,"priority":$var_priority,"power":$var_power,"contestCombos":$var_contestCombos,"contestType":$var_contestType,"contestEffect":$var_contestEffect,"damageClass":$var_damageClass,"effectEntries":$var_effectEntries,"effectChanges":$var_effectChanges,"generation":$var_generation,"meta":$var_meta,"names":$var_names,"pastValues":$var_pastValues,"statChanges":$var_statChanges,"superContestEffect":$var_superContestEffect,"target":$var_target,"type":$var_type,"machines":$var_machines,"flavorTextEntries":$var_flavorTextEntries,"learnedByPokemon":$var_learnedByPokemon
        | }
        """.stripMargin
}
