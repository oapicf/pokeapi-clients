package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveSummary
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
 * @param useBefore A list of moves to use before this move.
 * @param useAfter A list of moves to use after this move.
 */
data class MoveComboUsage(

    @field:Valid
    @Schema(required = true, description = "A list of moves to use before this move.")
    @param:JsonProperty("use_before", required = true)
    @get:JsonProperty("use_before", required = true) val useBefore: kotlin.collections.List<MoveSummary>?,

    @field:Valid
    @Schema(required = true, description = "A list of moves to use after this move.")
    @param:JsonProperty("use_after", required = true)
    @get:JsonProperty("use_after", required = true) val useAfter: kotlin.collections.List<MoveSummary>?
) {

}

