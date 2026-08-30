@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeDetailPastDamageRelationsInner(
    @field:JsonProperty("generation")
    val generation: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("damage_relations")
    val damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations,

)
