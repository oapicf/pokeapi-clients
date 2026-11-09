package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSpritesOther
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonFormSprites(
    /** The default depiction of this Pokémon from the front in battle. */
    val frontDefault: kotlin.String,
    /** The shiny depiction of this Pokémon from the front in battle. */
    val frontShiny: kotlin.String,
    /** The female depiction of this Pokémon from the front in battle. */
    val frontFemale: kotlin.String,
    /** The shiny female depiction of this Pokémon from the front in battle. */
    val frontShinyFemale: kotlin.String,
    /** The default depiction of this Pokémon from the back in battle. */
    val backDefault: kotlin.String,
    /** The shiny depiction of this Pokémon from the back in battle. */
    val backShiny: kotlin.String,
    /** The female depiction of this Pokémon from the back in battle. */
    val backFemale: kotlin.String,
    /** The shiny female depiction of this Pokémon from the back in battle. */
    val backShinyFemale: kotlin.String,
    /** Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. */
    val other: PokemonSpritesOther? = null,
    /** Sprites grouped by generation and game. Available keys vary by resource. */
    val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null
)
