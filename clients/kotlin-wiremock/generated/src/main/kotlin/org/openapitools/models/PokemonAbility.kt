@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonAbility(
    @field:JsonProperty("slot")
    val slot: kotlin.Int,

    @field:JsonProperty("ability")
    val ability: AbilitySummary,

    @field:JsonProperty("is_hidden")
    val isHidden: kotlin.Boolean? = null,

)
