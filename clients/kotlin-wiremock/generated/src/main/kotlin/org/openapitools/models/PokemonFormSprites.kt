@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonFormSprites(
    @field:JsonProperty("front_default")
    val frontDefault: kotlin.String,

    @field:JsonProperty("front_shiny")
    val frontShiny: kotlin.String,

    @field:JsonProperty("front_female")
    val frontFemale: kotlin.String,

    @field:JsonProperty("front_shiny_female")
    val frontShinyFemale: kotlin.String,

    @field:JsonProperty("back_default")
    val backDefault: kotlin.String,

    @field:JsonProperty("back_shiny")
    val backShiny: kotlin.String,

    @field:JsonProperty("back_female")
    val backFemale: kotlin.String,

    @field:JsonProperty("back_shiny_female")
    val backShinyFemale: kotlin.String,

    @field:JsonProperty("other")
    val other: PokemonSpritesOther? = null,

    @field:JsonProperty("versions")
    val versions: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.Any?>>? = null,

)
