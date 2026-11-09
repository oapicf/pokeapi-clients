package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveComboUsage
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
 * @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests.
 * @param `super` A detail of moves this move can be used before or after, granting additional appeal points in super contests.
 */
data class MoveCombos(

    @field:Valid
    @Schema(required = true, description = "A detail of moves this move can be used before or after, granting additional appeal points in contests.")
    @param:JsonProperty("normal", required = true)
    @get:JsonProperty("normal", required = true) val normal: MoveComboUsage,

    @field:Valid
    @Schema(required = true, description = "A detail of moves this move can be used before or after, granting additional appeal points in super contests.")
    @param:JsonProperty("super", required = true)
    @get:JsonProperty("super", required = true) val `super`: MoveComboUsage
) {

}

