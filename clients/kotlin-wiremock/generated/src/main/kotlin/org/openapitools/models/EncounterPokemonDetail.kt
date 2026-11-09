@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EncounterPokemonDetail(
    @field:JsonProperty("min_perfect_ivs")
    val minPerfectIvs: kotlin.Int? = null,

    @field:JsonProperty("always_shiny")
    val alwaysShiny: kotlin.Boolean? = null,

    @field:JsonProperty("never_shiny")
    val neverShiny: kotlin.Boolean? = null,

    @field:JsonProperty("is_alpha")
    val isAlpha: kotlin.Boolean? = null,

)
