@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemGameIndex(
    @field:JsonProperty("game_index")
    val gameIndex: kotlin.Int,

    @field:JsonProperty("generation")
    val generation: GenerationSummary,

)
