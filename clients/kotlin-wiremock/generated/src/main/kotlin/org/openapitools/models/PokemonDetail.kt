@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("abilities")
    val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,

    @field:JsonProperty("past_abilities")
    val pastAbilities: kotlin.collections.List<PokemonDetailPastAbilitiesInner>,

    @field:JsonProperty("forms")
    val forms: kotlin.collections.List<PokemonFormSummary>,

    @field:JsonProperty("game_indices")
    val gameIndices: kotlin.collections.List<PokemonGameIndex>,

    @field:JsonProperty("held_items")
    val heldItems: PokemonDetailHeldItems,

    @field:JsonProperty("location_area_encounters")
    val locationAreaEncounters: kotlin.String,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<PokemonDetailMovesInner>,

    @field:JsonProperty("species")
    val species: PokemonSpeciesSummary,

    @field:JsonProperty("sprites")
    val sprites: PokemonDetailSprites,

    @field:JsonProperty("cries")
    val cries: PokemonDetailCries,

    @field:JsonProperty("stats")
    val stats: kotlin.collections.List<PokemonStat>,

    @field:JsonProperty("types")
    val types: kotlin.collections.List<PokemonDetailTypesInner>,

    @field:JsonProperty("past_types")
    val pastTypes: kotlin.collections.List<PokemonDetailPastTypesInner>,

    @field:JsonProperty("base_experience")
    val baseExperience: kotlin.Int? = null,

    @field:JsonProperty("height")
    val height: kotlin.Int? = null,

    @field:JsonProperty("is_default")
    val isDefault: kotlin.Boolean? = null,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

    @field:JsonProperty("weight")
    val weight: kotlin.Int? = null,

)
