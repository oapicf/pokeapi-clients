package org.openapitools.server.api.model

import org.openapitools.server.api.model.PokemonShapeDetailAwesomeNamesInner
import org.openapitools.server.api.model.PokemonShapeDetailNamesInner
import org.openapitools.server.api.model.PokemonSpeciesSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonShapeDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val awesomeNames: kotlin.collections.List<PokemonShapeDetailAwesomeNamesInner>,
    val names: kotlin.collections.List<PokemonShapeDetailNamesInner>,
    val pokemonSpecies: kotlin.collections.List<PokemonSpeciesSummary>
)
