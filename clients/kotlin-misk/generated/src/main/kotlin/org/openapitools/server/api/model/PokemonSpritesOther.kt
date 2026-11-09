package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonSpritesOtherDreamWorld
import org.openapitools.server.api.model.PokemonSpritesOtherHome
import org.openapitools.server.api.model.PokemonSpritesOtherOfficialArtwork
import org.openapitools.server.api.model.PokemonSpritesOtherShowdown
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonSpritesOther(
    /** Pokémon Dream World artwork URLs. */
    val dreamWorld: PokemonSpritesOtherDreamWorld? = null,
    /** Pokémon HOME sprite URLs. */
    val home: PokemonSpritesOtherHome? = null,
    /** Pokémon Showdown sprite URLs. */
    val showdown: PokemonSpritesOtherShowdown? = null,
    /** Official Pokémon artwork URLs, including shiny artwork and version-specific variants. */
    val officialArtwork: PokemonSpritesOtherOfficialArtwork? = null
)
