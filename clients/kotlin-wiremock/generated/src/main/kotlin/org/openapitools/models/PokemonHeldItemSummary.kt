@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonHeldItemSummary(
    @field:JsonProperty("item")
    val item: ItemSummary,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<PokemonHeldItemVersion>,

)
