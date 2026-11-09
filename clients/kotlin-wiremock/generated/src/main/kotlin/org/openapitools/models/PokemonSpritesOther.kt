@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpritesOther(
    @field:JsonProperty("dream_world")
    val dreamWorld: PokemonSpritesOtherDreamWorld? = null,

    @field:JsonProperty("home")
    val home: PokemonSpritesOtherHome? = null,

    @field:JsonProperty("showdown")
    val showdown: PokemonSpritesOtherShowdown? = null,

    @field:JsonProperty("official-artwork")
    val officialArtwork: PokemonSpritesOtherOfficialArtwork? = null,

)
