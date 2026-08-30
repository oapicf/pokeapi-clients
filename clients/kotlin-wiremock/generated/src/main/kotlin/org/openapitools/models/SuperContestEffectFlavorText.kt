@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SuperContestEffectFlavorText(
    @field:JsonProperty("flavor_text")
    val flavorText: kotlin.String,

    @field:JsonProperty("language")
    val language: LanguageSummary,

)
