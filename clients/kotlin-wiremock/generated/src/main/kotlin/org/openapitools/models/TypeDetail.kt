@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("damage_relations")
    val damageRelations: TypeDetailDamageRelations,

    @field:JsonProperty("past_damage_relations")
    val pastDamageRelations: kotlin.collections.List<TypeDetailPastDamageRelationsInner>,

    @field:JsonProperty("game_indices")
    val gameIndices: kotlin.collections.List<TypeGameIndex>,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

    @field:JsonProperty("move_damage_class")
    val moveDamageClass: MoveDamageClassSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<AbilityName>,

    @field:JsonProperty("pokemon")
    val pokemon: kotlin.collections.List<TypeDetailPokemonInner>,

    @field:JsonProperty("moves")
    val moves: kotlin.collections.List<MoveSummary>,

    @field:JsonProperty("sprites")
    val sprites: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, TypeDetailSpritesValueValue>>,

)
