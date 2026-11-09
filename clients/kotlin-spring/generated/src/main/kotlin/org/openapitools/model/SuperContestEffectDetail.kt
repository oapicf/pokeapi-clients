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
 * @param id The identifier for this resource.
 * @param appeal The level of appeal this super contest effect has.
 * @param flavorTextEntries The flavor text of this super contest effect listed in different languages.
 * @param moves A list of moves that have the effect when used in super contests.
 */
data class SuperContestEffectDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The level of appeal this super contest effect has.")
    @param:JsonProperty("appeal", required = true)
    @get:JsonProperty("appeal", required = true) val appeal: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this super contest effect listed in different languages.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<SuperContestEffectFlavorText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of moves that have the effect when used in super contests.")
    @param:JsonProperty("moves", required = true)
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>
) {

}

