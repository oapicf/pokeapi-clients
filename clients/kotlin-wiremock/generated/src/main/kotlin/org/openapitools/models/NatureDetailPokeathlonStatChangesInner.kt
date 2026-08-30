@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class NatureDetailPokeathlonStatChangesInner(
    @field:JsonProperty("max_change")
    val maxChange: kotlin.Int,

    @field:JsonProperty("pokeathlon_stat")
    val pokeathlonStat: AbilityDetailPokemonInnerPokemon,

)
