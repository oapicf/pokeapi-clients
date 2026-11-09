package org.openapitools.server.api.model

import org.openapitools.server.api.model.EvolutionChainSummary
import org.openapitools.server.api.model.ItemAttributeSummary
import org.openapitools.server.api.model.ItemCategorySummary
import org.openapitools.server.api.model.ItemEffectText
import org.openapitools.server.api.model.ItemFlavorText
import org.openapitools.server.api.model.ItemFlingEffectSummary
import org.openapitools.server.api.model.ItemGameIndex
import org.openapitools.server.api.model.ItemMachine
import org.openapitools.server.api.model.ItemName
import org.openapitools.server.api.model.ItemPrice
import org.openapitools.server.api.model.ItemSprites
import org.openapitools.server.api.model.PokemonHeldItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The effect of the move Fling when used with this item. */
    val flingEffect: ItemFlingEffectSummary,
    /** A list of attributes this item has. */
    val attributes: kotlin.collections.List<ItemAttributeSummary>,
    /** The category of items this item falls into. */
    val category: ItemCategorySummary,
    /** The effect of this ability listed in different languages. */
    val effectEntries: kotlin.collections.List<ItemEffectText>,
    /** The flavor text of this ability listed in different languages. */
    val flavorTextEntries: kotlin.collections.List<ItemFlavorText>,
    /** A list of game indices relevent to this item by generation. */
    val gameIndices: kotlin.collections.List<ItemGameIndex>,
    /** Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. */
    val prices: kotlin.collections.List<ItemPrice>,
    /** The name of this item listed in different languages. */
    val names: kotlin.collections.List<ItemName>,
    /** A list of Pokémon that might be found in the wild holding this item. */
    val heldByPokemon: kotlin.collections.List<PokemonHeldItem>,
    /** A set of sprites used to depict this item in the game. */
    val sprites: ItemSprites,
    /** An evolution chain this item requires to produce a bay during mating. */
    val babyTriggerFor: EvolutionChainSummary,
    /** A list of the machines related to this item. */
    val machines: kotlin.collections.List<ItemMachine>,
    /** The power of the move Fling when used with this item. */
    val flingPower: kotlin.Int? = null
)
