@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AbilityDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<AbilityName>,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<AbilityEffectText>,

    @field:JsonProperty("effect_changes")
    val effectChanges: kotlin.collections.List<AbilityChange>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,

    @field:JsonProperty("pokemon")
    val pokemon: kotlin.collections.List<AbilityDetailPokemonInner>,

    @field:JsonProperty("is_main_series")
    val isMainSeries: kotlin.Boolean? = null,

)
