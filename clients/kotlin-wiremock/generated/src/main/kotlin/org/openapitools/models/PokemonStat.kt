@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonStat(
    @field:JsonProperty("base_stat")
    val baseStat: kotlin.Int,

    @field:JsonProperty("effort")
    val effort: kotlin.Int,

    @field:JsonProperty("stat")
    val stat: StatSummary,

)
