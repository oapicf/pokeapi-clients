package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeDetailDamageRelations(
    val noDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val halfDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val doubleDamageTo: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val noDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val halfDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val doubleDamageFrom: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>
)
