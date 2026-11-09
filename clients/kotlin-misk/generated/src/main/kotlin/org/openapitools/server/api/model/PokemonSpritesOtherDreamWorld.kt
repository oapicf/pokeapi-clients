package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpritesOtherDreamWorld(
    /** The URL of the default Pokémon Dream World front image, or null if unavailable. */
    val frontDefault: kotlin.String,
    /** The URL of the female Pokémon Dream World front image, or null if unavailable. */
    val frontFemale: kotlin.String
)
