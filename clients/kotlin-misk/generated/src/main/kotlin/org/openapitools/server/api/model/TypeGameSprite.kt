package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeGameSprite(
    /** The URL of the icon displaying the type name in this game, or null if unavailable. */
    val nameIcon: kotlin.String? = null,
    /** The URL of the type symbol icon in this game, or null if unavailable. */
    val symbolIcon: kotlin.String? = null
)
