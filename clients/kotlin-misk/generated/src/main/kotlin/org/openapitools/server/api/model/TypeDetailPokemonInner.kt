package org.openapitools.server.api.model

import org.openapitools.server.api.model.TypeDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetailPokemonInner(
    val slot: kotlin.Int? = null,
    val pokemon: TypeDetailPokemonInnerPokemon? = null
)
