package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.GenerationSummary
import org.openapitools.server.api.model.VersionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VersionGroupDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val generation: GenerationSummary,
    val moveLearnMethods: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val pokedexes: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val regions: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val versions: kotlin.collections.List<VersionSummary>,
    val order: kotlin.Int? = null
)
