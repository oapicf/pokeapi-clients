package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityChange
import org.openapitools.server.api.model.AbilityDetailPokemonInner
import org.openapitools.server.api.model.AbilityEffectText
import org.openapitools.server.api.model.AbilityFlavorText
import org.openapitools.server.api.model.AbilityName
import org.openapitools.server.api.model.GenerationSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AbilityDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val generation: GenerationSummary,
    val names: kotlin.collections.List<AbilityName>,
    val effectEntries: kotlin.collections.List<AbilityEffectText>,
    val effectChanges: kotlin.collections.List<AbilityChange>,
    val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,
    val pokemon: kotlin.collections.List<AbilityDetailPokemonInner>,
    val isMainSeries: kotlin.Boolean? = null
)
