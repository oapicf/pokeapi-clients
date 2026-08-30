@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemCategoryName(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("language")
    val language: LanguageSummary,

)
