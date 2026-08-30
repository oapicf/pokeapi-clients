@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokeathlonStatDetailAffectingNaturesIncreaseInner(
    @field:JsonProperty("max_change")
    val maxChange: kotlin.Int,

    @field:JsonProperty("nature")
    val nature: AbilityDetailPokemonInnerPokemon,

)
