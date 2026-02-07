package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveDetailContestCombosNormal
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
 * @param normal 
 * @param &#x60;super&#x60; 
 */
data class MoveDetailContestCombos(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("normal", required = true) val normal: MoveDetailContestCombosNormal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("super", required = true) val `super`: MoveDetailContestCombosNormal
) {

}

