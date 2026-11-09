package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PokemonFormSummary
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
 * @param trigger The trigger for this form change.
 * @param name The name of the required item, ability, or move. Only present for a resource-based trigger.
 * @param url The URL of the required item, ability, or move. Only present for a resource-based trigger.
 * @param baseForm The required base form. Only present when the trigger specifies one.
 */
data class PokemonFormTriggerCondition(

    @Schema(required = true, description = "The trigger for this form change.")
    @param:JsonProperty("trigger", required = true)
    @get:JsonProperty("trigger", required = true) val trigger: kotlin.String,

    @Schema(description = "The name of the required item, ability, or move. Only present for a resource-based trigger.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The URL of the required item, ability, or move. Only present for a resource-based trigger.")
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: java.net.URI? = null,

    @field:Valid
    @Schema(description = "The required base form. Only present when the trigger specifies one.")
    @param:JsonProperty("base_form")
    @get:JsonProperty("base_form") val baseForm: PokemonFormSummary? = null
) {

}

