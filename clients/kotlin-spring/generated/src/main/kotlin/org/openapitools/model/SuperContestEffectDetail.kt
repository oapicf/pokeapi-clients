package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveSummary
import org.openapitools.model.SuperContestEffectFlavorText
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
 * @param flavorTextEntries 
 * @param moves 
 */
data class SuperContestEffectDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("appeal", required = true) val appeal: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<SuperContestEffectFlavorText>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>
) {

}

