@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaDetailPokemonEncountersInner(
    @field:JsonProperty("pokemon")
    val pokemon: AbilityDetailPokemonInnerPokemon,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>,

)
