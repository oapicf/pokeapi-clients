package org.openapitools.server.api.model

import org.openapitools.server.api.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.server.api.model.ItemCategorySummary
import org.openapitools.server.api.model.ItemDetailBabyTriggerFor
import org.openapitools.server.api.model.ItemDetailHeldByPokemonInner
import org.openapitools.server.api.model.ItemDetailMachinesInner
import org.openapitools.server.api.model.ItemDetailSprites
import org.openapitools.server.api.model.ItemEffectText
import org.openapitools.server.api.model.ItemFlavorText
import org.openapitools.server.api.model.ItemFlingEffectSummary
import org.openapitools.server.api.model.ItemGameIndex
import org.openapitools.server.api.model.ItemName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val flingEffect: ItemFlingEffectSummary,
    val attributes: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,
    val category: ItemCategorySummary,
    val effectEntries: kotlin.collections.List<ItemEffectText>,
    val flavorTextEntries: kotlin.collections.List<ItemFlavorText>,
    val gameIndices: kotlin.collections.List<ItemGameIndex>,
    val names: kotlin.collections.List<ItemName>,
    val heldByPokemon: kotlin.collections.List<ItemDetailHeldByPokemonInner>,
    val sprites: ItemDetailSprites,
    val babyTriggerFor: ItemDetailBabyTriggerFor,
    val machines: kotlin.collections.List<ItemDetailMachinesInner>,
    val cost: kotlin.Int? = null,
    val flingPower: kotlin.Int? = null
)
