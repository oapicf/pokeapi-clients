@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonFormTriggerCondition(
    @field:JsonProperty("trigger")
    val trigger: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("url")
    val url: java.net.URI? = null,

    @field:JsonProperty("base_form")
    val baseForm: PokemonFormSummary? = null,

)
