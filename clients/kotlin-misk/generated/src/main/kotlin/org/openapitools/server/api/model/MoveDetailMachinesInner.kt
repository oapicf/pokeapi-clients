package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.MoveDetailMachinesInnerMachine
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoveDetailMachinesInner(
    val machine: MoveDetailMachinesInnerMachine,
    val versionGroup: AbilityDetailPokemonInnerPokemon
)
