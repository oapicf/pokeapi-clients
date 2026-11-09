@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokeapiMetaResponse(
    @field:JsonProperty("deploy_date")
    val deployDate: kotlin.String,

    @field:JsonProperty("hash")
    val hash: kotlin.String,

    @field:JsonProperty("tag")
    val tag: kotlin.String,

)
