package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AbilityChange
import org.openapitools.model.AbilityDetailPokemonInner
import org.openapitools.model.AbilityEffectText
import org.openapitools.model.AbilityFlavorText
import org.openapitools.model.AbilityName
import org.openapitools.model.GenerationSummary
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
 * @param generation 
 * @param names 
 * @param effectEntries 
 * @param effectChanges 
 * @param flavorTextEntries 
 * @param pokemon 
 * @param isMainSeries 
 */
data class AbilityDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<AbilityName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<AbilityEffectText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("effect_changes", required = true) val effectChanges: kotlin.collections.List<AbilityChange>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("pokemon", required = true) val pokemon: kotlin.collections.List<AbilityDetailPokemonInner>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("is_main_series") val isMainSeries: kotlin.Boolean? = null
) {

}

