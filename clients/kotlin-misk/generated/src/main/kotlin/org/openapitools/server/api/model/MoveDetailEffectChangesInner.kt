package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.MoveDetailEffectChangesInnerEffectEntriesInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetailEffectChangesInner(
    val effectEntries: kotlin.collections.List<MoveDetailEffectChangesInnerEffectEntriesInner>,
    val versionGroup: AbilityDetailPokemonInnerPokemon
)
