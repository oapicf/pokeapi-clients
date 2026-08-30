package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ContestEffectEffectText
import org.openapitools.model.ContestEffectFlavorText
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
 * @param appeal 
 * @param jam 
 * @param effectEntries 
 * @param flavorTextEntries 
 */
data class ContestEffectDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("appeal")
    @get:JsonProperty("appeal", required = true) val appeal: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("jam")
    @get:JsonProperty("jam", required = true) val jam: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("effect_entries")
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<ContestEffectEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("flavor_text_entries")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<ContestEffectFlavorText>
) {

}

