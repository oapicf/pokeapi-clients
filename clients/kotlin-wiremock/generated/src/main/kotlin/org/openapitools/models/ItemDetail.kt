@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("fling_effect")
    val flingEffect: ItemFlingEffectSummary,

    @field:JsonProperty("attributes")
    val attributes: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:JsonProperty("category")
    val category: ItemCategorySummary,

    @field:JsonProperty("effect_entries")
    val effectEntries: kotlin.collections.List<ItemEffectText>,

    @field:JsonProperty("flavor_text_entries")
    val flavorTextEntries: kotlin.collections.List<ItemFlavorText>,

    @field:JsonProperty("game_indices")
    val gameIndices: kotlin.collections.List<ItemGameIndex>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<ItemName>,

    @field:JsonProperty("held_by_pokemon")
    val heldByPokemon: kotlin.collections.List<ItemDetailHeldByPokemonInner>,

    @field:JsonProperty("sprites")
    val sprites: ItemDetailSprites,

    @field:JsonProperty("baby_trigger_for")
    val babyTriggerFor: ItemDetailBabyTriggerFor,

    @field:JsonProperty("machines")
    val machines: kotlin.collections.List<ItemDetailMachinesInner>,

    @field:JsonProperty("cost")
    val cost: kotlin.Int? = null,

    @field:JsonProperty("fling_power")
    val flingPower: kotlin.Int? = null,

)
