@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpritesOtherOfficialArtwork(
    @field:JsonProperty("front_default")
    val frontDefault: kotlin.String,

    @field:JsonProperty("front_shiny")
    val frontShiny: kotlin.String,

    @field:JsonProperty("versions")
    val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null,

)
