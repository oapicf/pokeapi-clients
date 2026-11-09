@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocationAreaPokemonEncounter(
    @field:JsonProperty("pokemon")
    val pokemon: PokemonSummary,

    @field:JsonProperty("version_details")
    val versionDetails: kotlin.collections.List<LocationAreaPokemonEncounterVersion>,

)
