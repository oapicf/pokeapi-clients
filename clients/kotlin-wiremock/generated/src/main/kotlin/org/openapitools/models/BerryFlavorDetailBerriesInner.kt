@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BerryFlavorDetailBerriesInner(
    @field:JsonProperty("potency")
    val potency: kotlin.Int,

    @field:JsonProperty("berry")
    val berry: BerryFlavorDetailBerriesInnerBerry,

)
