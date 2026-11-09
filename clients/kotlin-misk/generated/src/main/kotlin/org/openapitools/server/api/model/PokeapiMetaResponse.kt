package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokeapiMetaResponse(
    /** The deployment time as a Unix timestamp string. */
    val deployDate: kotlin.String,
    /** The source commit hash used for this deployment. */
    val hash: kotlin.String,
    /** The deployment tag, or null if the deployment has no tag. */
    val tag: kotlin.String
)
