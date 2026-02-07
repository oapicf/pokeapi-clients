package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesDecreaseInner
import org.openapitools.model.PokeathlonStatDetailAffectingNaturesIncreaseInner
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
 * @param decrease 
 * @param increase 
 */
data class PokeathlonStatDetailAffectingNatures(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("decrease", required = true) val decrease: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesDecreaseInner>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("increase", required = true) val increase: kotlin.collections.List<PokeathlonStatDetailAffectingNaturesIncreaseInner>
) {

}

