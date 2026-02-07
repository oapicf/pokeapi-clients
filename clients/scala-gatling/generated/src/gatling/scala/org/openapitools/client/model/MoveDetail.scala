
package org.openapitools.client.model


case class MoveDetail (
    _id: Integer,
    _name: String,
    _accuracy: Option[Integer],
    _effectChance: Integer,
    _pp: Option[Integer],
    _priority: Option[Integer],
    _power: Option[Integer],
    _contestCombos: MoveDetailContestCombos,
    _contestType: ContestTypeSummary,
    _contestEffect: ContestEffectSummary,
    _damageClass: MoveDamageClassSummary,
    _effectEntries: List[MoveChangeEffectEntriesInner],
    _effectChanges: List[MoveDetailEffectChangesInner],
    _generation: GenerationSummary,
    _meta: MoveMeta,
    _names: List[MoveName],
    _pastValues: List[MoveChange],
    _statChanges: List[MoveDetailStatChangesInner],
    _superContestEffect: SuperContestEffectSummary,
    _target: MoveTargetSummary,
    _type: TypeSummary,
    _machines: List[MoveDetailMachinesInner],
    _flavorTextEntries: List[MoveFlavorText],
    _learnedByPokemon: List[AbilityDetailPokemonInnerPokemon]
)
object MoveDetail {
    def toStringBody(var_id: Object, var_name: Object, var_accuracy: Object, var_effectChance: Object, var_pp: Object, var_priority: Object, var_power: Object, var_contestCombos: Object, var_contestType: Object, var_contestEffect: Object, var_damageClass: Object, var_effectEntries: Object, var_effectChanges: Object, var_generation: Object, var_meta: Object, var_names: Object, var_pastValues: Object, var_statChanges: Object, var_superContestEffect: Object, var_target: Object, var_type: Object, var_machines: Object, var_flavorTextEntries: Object, var_learnedByPokemon: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"accuracy":$var_accuracy,"effectChance":$var_effectChance,"pp":$var_pp,"priority":$var_priority,"power":$var_power,"contestCombos":$var_contestCombos,"contestType":$var_contestType,"contestEffect":$var_contestEffect,"damageClass":$var_damageClass,"effectEntries":$var_effectEntries,"effectChanges":$var_effectChanges,"generation":$var_generation,"meta":$var_meta,"names":$var_names,"pastValues":$var_pastValues,"statChanges":$var_statChanges,"superContestEffect":$var_superContestEffect,"target":$var_target,"type":$var_type,"machines":$var_machines,"flavorTextEntries":$var_flavorTextEntries,"learnedByPokemon":$var_learnedByPokemon
        | }
        """.stripMargin
}
