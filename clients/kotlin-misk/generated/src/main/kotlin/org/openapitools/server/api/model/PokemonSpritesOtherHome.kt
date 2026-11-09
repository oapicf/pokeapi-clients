package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpritesOtherHome(
    /** The URL of the default Pokémon HOME front image, or null if unavailable. */
    val frontDefault: kotlin.String,
    /** The URL of the female Pokémon HOME front image, or null if unavailable. */
    val frontFemale: kotlin.String,
    /** The URL of the shiny Pokémon HOME front image, or null if unavailable. */
    val frontShiny: kotlin.String,
    /** The URL of the shiny female Pokémon HOME front image, or null if unavailable. */
    val frontShinyFemale: kotlin.String
)
