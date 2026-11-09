package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpritesOtherOfficialArtwork(
    /** The URL of the default front official artwork, or null if unavailable. */
    val frontDefault: kotlin.String,
    /** The URL of the shiny front official artwork, or null if unavailable. */
    val frontShiny: kotlin.String,
    /** Additional official artwork grouped by version. Available keys vary by resource. */
    val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null
)
