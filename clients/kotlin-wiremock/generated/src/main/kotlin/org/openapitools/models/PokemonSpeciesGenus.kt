@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpeciesGenus(
    @field:JsonProperty("genus")
    val genus: kotlin.String,

    @field:JsonProperty("language")
    val language: LanguageSummary,

)
