@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LanguageDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("iso639")
    val iso639: kotlin.String,

    @field:JsonProperty("iso3166")
    val iso3166: kotlin.String,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<LanguageName>,

    @field:JsonProperty("official")
    val official: kotlin.Boolean? = null,

)
