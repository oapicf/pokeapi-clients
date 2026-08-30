@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BerryFirmnessDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("berries")
    val berries: kotlin.collections.List<BerrySummary>,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<BerryFirmnessName>,

)
