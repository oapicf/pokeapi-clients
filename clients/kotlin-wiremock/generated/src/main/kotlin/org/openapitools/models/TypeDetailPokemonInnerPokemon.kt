@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeDetailPokemonInnerPokemon(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("url")
    val url: java.net.URI? = null,

)
