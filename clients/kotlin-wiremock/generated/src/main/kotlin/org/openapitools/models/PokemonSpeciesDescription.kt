@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesDescription(
    @field:JsonProperty("language")
    val language: LanguageSummary,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
