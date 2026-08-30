package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonShapeDetailNamesInner(
    val url: java.net.URI,
    val name: kotlin.String
)
