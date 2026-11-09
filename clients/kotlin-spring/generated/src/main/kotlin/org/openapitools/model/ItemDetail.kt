package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EvolutionChainSummary
import org.openapitools.model.ItemAttributeSummary
import org.openapitools.model.ItemCategorySummary
import org.openapitools.model.ItemEffectText
import org.openapitools.model.ItemFlavorText
import org.openapitools.model.ItemFlingEffectSummary
import org.openapitools.model.ItemGameIndex
import org.openapitools.model.ItemMachine
import org.openapitools.model.ItemName
import org.openapitools.model.ItemPrice
import org.openapitools.model.ItemSprites
import org.openapitools.model.PokemonHeldItem
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param flingEffect The effect of the move Fling when used with this item.
 * @param attributes A list of attributes this item has.
 * @param category The category of items this item falls into.
 * @param effectEntries The effect of this ability listed in different languages.
 * @param flavorTextEntries The flavor text of this ability listed in different languages.
 * @param gameIndices A list of game indices relevent to this item by generation.
 * @param prices Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
 * @param names The name of this item listed in different languages.
 * @param heldByPokemon A list of Pokémon that might be found in the wild holding this item.
 * @param sprites A set of sprites used to depict this item in the game.
 * @param babyTriggerFor An evolution chain this item requires to produce a bay during mating.
 * @param machines A list of the machines related to this item.
 * @param flingPower The power of the move Fling when used with this item.
 */
data class ItemDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The effect of the move Fling when used with this item.")
    @param:JsonProperty("fling_effect", required = true)
    @get:JsonProperty("fling_effect", required = true) val flingEffect: ItemFlingEffectSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of attributes this item has.")
    @param:JsonProperty("attributes", required = true)
    @get:JsonProperty("attributes", required = true) val attributes: kotlin.collections.List<ItemAttributeSummary>,

    @field:Valid
    @Schema(required = true, description = "The category of items this item falls into.")
    @param:JsonProperty("category", required = true)
    @get:JsonProperty("category", required = true) val category: ItemCategorySummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The effect of this ability listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<ItemEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this ability listed in different languages.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<ItemFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of game indices relevent to this item by generation.")
    @param:JsonProperty("game_indices", required = true)
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<ItemGameIndex>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.")
    @param:JsonProperty("prices", required = true)
    @get:JsonProperty("prices", required = true) val prices: kotlin.collections.List<ItemPrice>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this item listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<ItemName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of Pokémon that might be found in the wild holding this item.")
    @param:JsonProperty("held_by_pokemon", required = true)
    @get:JsonProperty("held_by_pokemon", required = true) val heldByPokemon: kotlin.collections.List<PokemonHeldItem>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A set of sprites used to depict this item in the game.")
    @param:JsonProperty("sprites", required = true)
    @get:JsonProperty("sprites", required = true) val sprites: ItemSprites,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "An evolution chain this item requires to produce a bay during mating.")
    @param:JsonProperty("baby_trigger_for", required = true)
    @get:JsonProperty("baby_trigger_for", required = true) val babyTriggerFor: EvolutionChainSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of the machines related to this item.")
    @param:JsonProperty("machines", required = true)
    @get:JsonProperty("machines", required = true) val machines: kotlin.collections.List<ItemMachine>,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The power of the move Fling when used with this item.")
    @param:JsonProperty("fling_power")
    @get:JsonProperty("fling_power") val flingPower: kotlin.Int? = null
) {

}

