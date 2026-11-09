@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonMove(
    @field:JsonProperty("move")
    val move: MoveSummary,

    @field:JsonProperty("version_group_details")
    val versionGroupDetails: kotlin.collections.List<PokemonMoveVersionGroup>,

)
