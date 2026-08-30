package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.TypeDetailPastDamageRelationsInnerDamageRelations
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetailPastDamageRelationsInner(
    val generation: AbilityDetailPokemonInnerPokemon,
    val damageRelations: TypeDetailPastDamageRelationsInnerDamageRelations
)
