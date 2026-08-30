@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ContestTypeDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("berry_flavor")
    val berryFlavor: BerryFlavorSummary,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<ContestTypeName>,

)
