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
 * @param id The identifier for this resource.
 * @param appeal The base number of hearts the user of this move gets.
 * @param jam The base number of hearts the user's opponent loses.
 * @param effectEntries The result of this contest effect listed in different languages.
 * @param flavorTextEntries The flavor text of this contest effect listed in different languages.
 */
data class ContestEffectDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The base number of hearts the user of this move gets.")
    @param:JsonProperty("appeal", required = true)
    @get:JsonProperty("appeal", required = true) val appeal: kotlin.Int,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(required = true, description = "The base number of hearts the user's opponent loses.")
    @param:JsonProperty("jam", required = true)
    @get:JsonProperty("jam", required = true) val jam: kotlin.Int,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The result of this contest effect listed in different languages.")
    @param:JsonProperty("effect_entries", required = true)
    @get:JsonProperty("effect_entries", required = true) val effectEntries: kotlin.collections.List<ContestEffectEffectText>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The flavor text of this contest effect listed in different languages.")
    @param:JsonProperty("flavor_text_entries", required = true)
    @get:JsonProperty("flavor_text_entries", required = true) val flavorTextEntries: kotlin.collections.List<ContestEffectFlavorText>
) {

}

