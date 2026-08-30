package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EncounterConditionName
import org.openapitools.model.EncounterConditionValueSummary
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
 * @param name 
 * @param propertyValues 
 * @param names 
 */
data class EncounterConditionDetail(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("values")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<EncounterConditionValueSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<EncounterConditionName>
) {

}

