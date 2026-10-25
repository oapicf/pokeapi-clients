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

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<AbilityName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<AbilityEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("effect_changes", required = true)
    @get:JsonProperty("effect_changes", required = true) val effectChanges: kotlin.collections.List<AbilityChange>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<AbilityFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("pokemon", required = true)
    @get:JsonProperty("pokemon", required = true) val pokemon: kotlin.collections.List<AbilityDetailPokemonInner>,

    @Schema(description = "")
    @param:JsonProperty("is_main_series")
    @get:JsonProperty("is_main_series") val isMainSeries: kotlin.Boolean? = null
) {

}

