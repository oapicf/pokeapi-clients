package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.GenderDetailPokemonSpeciesDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val pokemonSpeciesDetails: kotlin.collections.List<GenderDetailPokemonSpeciesDetailsInner>,
    val requiredForEvolution: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
