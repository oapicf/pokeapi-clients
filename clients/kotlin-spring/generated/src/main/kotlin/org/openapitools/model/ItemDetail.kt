package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityDetailPokemonInnerPokemon
import org.openapitools.model.ItemCategorySummary
import org.openapitools.model.ItemDetailBabyTriggerFor
import org.openapitools.model.ItemDetailHeldByPokemonInner
import org.openapitools.model.ItemDetailMachinesInner
import org.openapitools.model.ItemDetailSprites
import org.openapitools.model.ItemEffectText
import org.openapitools.model.ItemFlavorText
import org.openapitools.model.ItemFlingEffectSummary
import org.openapitools.model.ItemGameIndex
import org.openapitools.model.ItemName
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
 * @param id 
 * @param name 
 * @param flingEffect 
 * @param attributes 
 * @param category 
 * @param effectEntries 
 * @param flavorTextEntries 
 * @param gameIndices 
 * @param names 
 * @param heldByPokemon 
 * @param sprites 
 * @param babyTriggerFor 
 * @param machines 
 * @param cost 
 * @param flingPower 
 */
data class ItemDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("fling_effect", required = true) val flingEffect: ItemFlingEffectSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attributes", required = true) val attributes: kotlin.collections.List<AbilityDetailPokemonInnerPokemon>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("category", required = true) val category: ItemCategorySummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<ItemEffectText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<ItemFlavorText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<ItemGameIndex>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<ItemName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("held_by_pokemon", required = true) val heldByPokemon: kotlin.collections.List<ItemDetailHeldByPokemonInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sprites", required = true) val sprites: ItemDetailSprites,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("baby_trigger_for", required = true) val babyTriggerFor: ItemDetailBabyTriggerFor,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("machines", required = true) val machines: kotlin.collections.List<ItemDetailMachinesInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cost") val cost: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fling_power") val flingPower: kotlin.Int? = null
) {

}

