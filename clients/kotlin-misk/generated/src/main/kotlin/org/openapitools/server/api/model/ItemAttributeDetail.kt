package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.ItemAttributeDescription
import org.openapitools.server.api.model.ItemAttributeName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemAttributeDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val descriptions: kotlin.collections.List<ItemAttributeDescription>,
    val items: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val names: kotlin.collections.List<ItemAttributeName>
)
