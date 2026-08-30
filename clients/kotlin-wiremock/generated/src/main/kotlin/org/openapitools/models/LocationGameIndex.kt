@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationGameIndex(
    @field:JsonProperty("game_index")
    val gameIndex: kotlin.Int,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

)
