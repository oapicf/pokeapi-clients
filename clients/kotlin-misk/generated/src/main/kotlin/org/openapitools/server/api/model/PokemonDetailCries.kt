package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailCries(
    val latest: java.net.URI,
    val legacy: java.net.URI
)
