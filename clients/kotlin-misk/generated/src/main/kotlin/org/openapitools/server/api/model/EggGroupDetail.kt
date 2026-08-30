package org.openapitools.server.api.model

import org.openapitools.server.api.model.EggGroupDetailPokemonSpeciesInner
import org.openapitools.server.api.model.EggGroupName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EggGroupDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val names: kotlin.collections.List<EggGroupName>,
    val pokemonSpecies: kotlin.collections.List<EggGroupDetailPokemonSpeciesInner>
)
