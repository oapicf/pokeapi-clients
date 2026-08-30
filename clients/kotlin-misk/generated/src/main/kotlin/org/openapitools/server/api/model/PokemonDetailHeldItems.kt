package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.ItemDetailHeldByPokemonInnerVersionDetailsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonDetailHeldItems(
    val item: AbilityDetailPokemonInnerPokemon,
    val versionDetails: kotlin.collections.List<ItemDetailHeldByPokemonInnerVersionDetailsInner>
)
