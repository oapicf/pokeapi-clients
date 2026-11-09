package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EvolutionVariableSummary
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
 * @param expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
 * @param percentageChance Percentage chance of evolution under this condition (0-100)
 * @param variables Evolution variables referenced in the expression
 */
data class EvolutionConditionExpression(

    @Schema(required = true, description = "Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')")
    @param:JsonProperty("expression", required = true)
    @get:JsonProperty("expression", required = true) val expression: kotlin.String,

    @Schema(required = true, description = "Percentage chance of evolution under this condition (0-100)")
    @param:JsonProperty("percentage_chance", required = true)
    @get:JsonProperty("percentage_chance", required = true) val percentageChance: kotlin.Double?,

    @field:Valid
    @Schema(required = true, description = "Evolution variables referenced in the expression")
    @param:JsonProperty("variables", required = true)
    @get:JsonProperty("variables", required = true) val variables: kotlin.collections.List<EvolutionVariableSummary>
) {

}

