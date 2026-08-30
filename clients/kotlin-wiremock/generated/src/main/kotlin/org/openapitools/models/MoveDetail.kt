@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("effect_chance")
    val effectChance: kotlin.Int,

    @field:JsonProperty("contest_combos")
    val contestCombos: MoveDetailContestCombos,

    @field:JsonProperty("contest_type")
    val contestType: ContestTypeSummary,

    @field:JsonProperty("contest_effect")
    val contestEffect: ContestEffectSummary,

    @field:JsonProperty("damage_class")
    val damageClass: MoveDamageClassSummary,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,

    @field:JsonProperty("effect_changes")
    val effectChanges: kotlin.collections.List<MoveDetailEffectChangesInner>,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("meta")
    val meta: MoveMeta,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<MoveName>,

    @field:JsonProperty("past_values")
    val pastValues: kotlin.collections.List<MoveChange>,

    @field:JsonProperty("stat_changes")
    val statChanges: kotlin.collections.List<MoveDetailStatChangesInner>,

    @field:JsonProperty("super_contest_effect")
    val superContestEffect: SuperContestEffectSummary,

    @field:JsonProperty("target")
    val target: MoveTargetSummary,

    @field:JsonProperty("type")
    val type: TypeSummary,

    @field:JsonProperty("machines")
    val machines: kotlin.collections.List<MoveDetailMachinesInner>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<MoveFlavorText>,

    @field:JsonProperty("learned_by_pokemon")
    val learnedByPokemon: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("accuracy")
    val accuracy: kotlin.Int? = null,

    @field:JsonProperty("pp")
    val pp: kotlin.Int? = null,

    @field:JsonProperty("priority")
    val priority: kotlin.Int? = null,

    @field:JsonProperty("power")
    val power: kotlin.Int? = null,

)
