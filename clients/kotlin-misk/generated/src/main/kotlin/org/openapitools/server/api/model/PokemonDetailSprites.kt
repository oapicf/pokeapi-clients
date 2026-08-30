package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailSprites(
    val frontDefault: java.net.URI? = null
)
