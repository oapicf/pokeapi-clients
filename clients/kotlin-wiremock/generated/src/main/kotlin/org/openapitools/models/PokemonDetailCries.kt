@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDetailCries(
    @field:JsonProperty("latest")
    val latest: java.net.URI,

    @field:JsonProperty("legacy")
    val legacy: java.net.URI,

)
