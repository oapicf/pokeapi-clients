@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonFormDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("form_name")
    val formName: kotlin.String,

    @field:JsonProperty("pokemon")
    val pokemon: PokemonSummary,

    @field:JsonProperty("sprites")
    val sprites: PokemonFormSprites,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("form_names")
    val formNames: kotlin.collections.List<PokemonFormName>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<PokemonFormName>,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<PokemonFormType>,

    @field:JsonProperty("trigger_conditions")
    val triggerConditions: kotlin.collections.List<PokemonFormTriggerCondition>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<PokemonFormFlavorText>,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

    @field:JsonProperty("form_order")
    val formOrder: kotlin.Int? = null,

    @field:JsonProperty("is_default")
    val isDefault: kotlin.Boolean? = null,

    @field:JsonProperty("is_battle_only")
    val isBattleOnly: kotlin.Boolean? = null,

    @field:JsonProperty("is_mega")
    val isMega: kotlin.Boolean? = null,

)
