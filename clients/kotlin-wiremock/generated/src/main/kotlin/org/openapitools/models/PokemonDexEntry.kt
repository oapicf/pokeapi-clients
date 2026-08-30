@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDexEntry(
    @field:JsonProperty("entry_number")
    val entryNumber: kotlin.Int,

    @field:JsonProperty("pokedex")
    val pokedex: PokedexSummary,

)
