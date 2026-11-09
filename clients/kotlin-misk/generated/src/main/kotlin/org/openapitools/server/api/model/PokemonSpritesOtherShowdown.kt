package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpritesOtherShowdown(
    /** The URL of the default Pokémon Showdown front image, or null if unavailable. */
    val frontDefault: kotlin.String,
    /** The URL of the female Pokémon Showdown front image, or null if unavailable. */
    val frontFemale: kotlin.String,
    /** The URL of the shiny Pokémon Showdown front image, or null if unavailable. */
    val frontShiny: kotlin.String,
    /** The URL of the shiny female Pokémon Showdown front image, or null if unavailable. */
    val frontShinyFemale: kotlin.String,
    /** The URL of the default Pokémon Showdown back image, or null if unavailable. */
    val backDefault: kotlin.String,
    /** The URL of the female Pokémon Showdown back image, or null if unavailable. */
    val backFemale: kotlin.String,
    /** The URL of the shiny Pokémon Showdown back image, or null if unavailable. */
    val backShiny: kotlin.String,
    /** The URL of the shiny female Pokémon Showdown back image, or null if unavailable. */
    val backShinyFemale: kotlin.String
)
