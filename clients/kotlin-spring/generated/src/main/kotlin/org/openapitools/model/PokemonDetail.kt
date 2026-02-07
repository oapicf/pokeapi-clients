package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonDetailAbilitiesInner
import org.openapitools.model.PokemonDetailCries
import org.openapitools.model.PokemonDetailHeldItems
import org.openapitools.model.PokemonDetailMovesInner
import org.openapitools.model.PokemonDetailPastAbilitiesInner
import org.openapitools.model.PokemonDetailPastTypesInner
import org.openapitools.model.PokemonDetailSprites
import org.openapitools.model.PokemonDetailTypesInner
import org.openapitools.model.PokemonFormSummary
import org.openapitools.model.PokemonGameIndex
import org.openapitools.model.PokemonSpeciesSummary
import org.openapitools.model.PokemonStat
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
 * @param abilities 
 * @param pastAbilities 
 * @param forms 
 * @param gameIndices 
 * @param heldItems 
 * @param locationAreaEncounters 
 * @param moves 
 * @param species 
 * @param sprites 
 * @param cries 
 * @param stats 
 * @param types 
 * @param pastTypes 
 * @param baseExperience 
 * @param height 
 * @param isDefault 
 * @param order 
 * @param weight 
 */
data class PokemonDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("abilities", required = true) val abilities: kotlin.collections.List<PokemonDetailAbilitiesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("past_abilities", required = true) val pastAbilities: kotlin.collections.List<PokemonDetailPastAbilitiesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("forms", required = true) val forms: kotlin.collections.List<PokemonFormSummary>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<PokemonGameIndex>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("held_items", required = true) val heldItems: PokemonDetailHeldItems,

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("location_area_encounters", required = true) val locationAreaEncounters: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<PokemonDetailMovesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("species", required = true) val species: PokemonSpeciesSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sprites", required = true) val sprites: PokemonDetailSprites,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("cries", required = true) val cries: PokemonDetailCries,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("stats", required = true) val stats: kotlin.collections.List<PokemonStat>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("types", required = true) val types: kotlin.collections.List<PokemonDetailTypesInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("past_types", required = true) val pastTypes: kotlin.collections.List<PokemonDetailPastTypesInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("base_experience") val baseExperience: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("order") val order: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("weight") val weight: kotlin.Int? = null
) {

}

