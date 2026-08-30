@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetailStatChangesInner(
    @field:JsonProperty("change")
    val change: kotlin.Int,

    @field:JsonProperty("stat")
    val stat: AbilityDetailPokemonInnerPokemon,

)
