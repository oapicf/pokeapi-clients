@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpritesOtherHome(
    @field:JsonProperty("front_default")
    val frontDefault: kotlin.String,

    @field:JsonProperty("front_female")
    val frontFemale: kotlin.String,

    @field:JsonProperty("front_shiny")
    val frontShiny: kotlin.String,

    @field:JsonProperty("front_shiny_female")
    val frontShinyFemale: kotlin.String,

)
