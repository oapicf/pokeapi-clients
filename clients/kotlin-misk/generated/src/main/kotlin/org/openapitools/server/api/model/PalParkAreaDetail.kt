package org.openapitools.server.api.model

import org.openapitools.server.api.model.PalParkAreaDetailPokemonEncountersInner
import org.openapitools.server.api.model.PalParkAreaName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PalParkAreaDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<PalParkAreaName>,
    val pokemonEncounters: kotlin.collections.List<PalParkAreaDetailPokemonEncountersInner>
)
