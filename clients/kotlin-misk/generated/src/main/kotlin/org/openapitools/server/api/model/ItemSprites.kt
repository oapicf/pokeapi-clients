package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemSprites(
    /** The default depiction of this item. */
    val default: kotlin.String
)
