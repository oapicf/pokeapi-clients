@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TypeGameSprite(
    @field:JsonProperty("name_icon")
    val nameIcon: kotlin.String? = null,

    @field:JsonProperty("symbol_icon")
    val symbolIcon: kotlin.String? = null,

)
