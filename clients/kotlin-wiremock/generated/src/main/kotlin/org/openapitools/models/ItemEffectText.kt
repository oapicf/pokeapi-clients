@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemEffectText(
    @field:JsonProperty("effect")
    val effect: kotlin.String,

    @field:JsonProperty("short_effect")
    val shortEffect: kotlin.String,

    @field:JsonProperty("language")
    val language: LanguageSummary,

)
