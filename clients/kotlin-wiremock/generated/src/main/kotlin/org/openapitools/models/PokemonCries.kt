@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonCries(
    @field:JsonProperty("latest")
    val latest: kotlin.String,

    @field:JsonProperty("legacy")
    val legacy: kotlin.String,

)
