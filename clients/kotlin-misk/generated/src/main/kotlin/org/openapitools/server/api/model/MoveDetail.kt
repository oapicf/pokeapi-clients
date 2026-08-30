package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.ContestEffectSummary
import org.openapitools.server.api.model.ContestTypeSummary
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.MoveChange
import org.openapitools.server.api.model.MoveChangeEffectEntriesInner
import org.openapitools.server.api.model.MoveDamageClassSummary
import org.openapitools.server.api.model.MoveDetailContestCombos
import org.openapitools.server.api.model.MoveDetailEffectChangesInner
import org.openapitools.server.api.model.MoveDetailMachinesInner
import org.openapitools.server.api.model.MoveDetailStatChangesInner
import org.openapitools.server.api.model.MoveFlavorText
import org.openapitools.server.api.model.MoveMeta
import org.openapitools.server.api.model.MoveName
import org.openapitools.server.api.model.MoveTargetSummary
import org.openapitools.server.api.model.SuperContestEffectSummary
import org.openapitools.server.api.model.TypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val effectChance: kotlin.Int,
    val contestCombos: MoveDetailContestCombos,
    val contestType: ContestTypeSummary,
    val contestEffect: ContestEffectSummary,
    val damageClass: MoveDamageClassSummary,
    val effectEntries: kotlin.collections.List<MoveChangeEffectEntriesInner>,
    val effectChanges: kotlin.collections.List<MoveDetailEffectChangesInner>,
    val generation: GenerationSummary,
    val meta: MoveMeta,
    val names: kotlin.collections.List<MoveName>,
    val pastValues: kotlin.collections.List<MoveChange>,
    val statChanges: kotlin.collections.List<MoveDetailStatChangesInner>,
    val superContestEffect: SuperContestEffectSummary,
    val target: MoveTargetSummary,
    val type: TypeSummary,
    val machines: kotlin.collections.List<MoveDetailMachinesInner>,
    val flavorTextEntries: kotlin.collections.List<MoveFlavorText>,
    val learnedByPokemon: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val accuracy: kotlin.Int? = null,
    val pp: kotlin.Int? = null,
    val priority: kotlin.Int? = null,
    val power: kotlin.Int? = null
)
