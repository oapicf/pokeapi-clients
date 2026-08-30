@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemDetailMachinesInner(
    @field:JsonProperty("machine")
    val machine: java.net.URI,

    @field:JsonProperty("version_group")
    val versionGroup: AbilityDetailPokemonInnerPokemon,

)
