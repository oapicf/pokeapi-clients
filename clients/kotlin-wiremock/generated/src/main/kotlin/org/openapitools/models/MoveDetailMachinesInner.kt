@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MoveDetailMachinesInner(
    @field:JsonProperty("machine")
    val machine: MoveDetailMachinesInnerMachine,

    @field:JsonProperty("version_group")
    val versionGroup: AbilityDetailPokemonInnerPokemon,

)
