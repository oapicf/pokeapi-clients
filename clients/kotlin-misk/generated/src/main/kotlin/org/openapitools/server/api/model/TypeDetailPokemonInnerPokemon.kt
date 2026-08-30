package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetailPokemonInnerPokemon(
    /** The name of the pokemon */
    val name: kotlin.String? = null,
    /** The URL to get more information about the pokemon */
    val url: java.net.URI? = null
)
