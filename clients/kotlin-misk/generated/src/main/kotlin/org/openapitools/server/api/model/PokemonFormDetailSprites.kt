package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormDetailSprites(
    val default: java.net.URI? = null
)
