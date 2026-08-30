@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetailEffectChangesInner(
    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<MoveDetailEffectChangesInnerEffectEntriesInner>,

    @field:JsonProperty("version_group")
    val versionGroup: AbilityDetailPokemonInnerPokemon,

)
