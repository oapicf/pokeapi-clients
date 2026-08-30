package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemDetailSprites(
    val default: java.net.URI
)
