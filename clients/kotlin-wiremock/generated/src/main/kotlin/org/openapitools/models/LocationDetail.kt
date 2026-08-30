@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("region")
    val region: RegionSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<LocationName>,

    @field:JsonProperty("game_indices")
    val gameIndices: kotlin.collections.List<LocationGameIndex>,

    @field:JsonProperty("areas")
    val areas: kotlin.collections.List<LocationAreaSummary>,

)
