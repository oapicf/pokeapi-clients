package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonCries(
    /** The latest depiction of this Pokémon&#39;s cry. */
    val latest: kotlin.String,
    /** The legacy depiction of this Pokémon&#39;s cry. */
    val legacy: kotlin.String
)
