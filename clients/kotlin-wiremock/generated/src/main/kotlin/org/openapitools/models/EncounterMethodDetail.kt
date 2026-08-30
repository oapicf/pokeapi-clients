@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EncounterMethodDetail(
    @field:JsonProperty("id")
    val id: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("names")
    val names: kotlin.collections.List<EncounterMethodName>,

    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

)
