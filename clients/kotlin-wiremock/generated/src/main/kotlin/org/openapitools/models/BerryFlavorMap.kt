@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BerryFlavorMap(
    @field:JsonProperty("potency")
    val potency: kotlin.Int,

    @field:JsonProperty("flavor")
    val flavor: BerryFlavorSummary,

)
