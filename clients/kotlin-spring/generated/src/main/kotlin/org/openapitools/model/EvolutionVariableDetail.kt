package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.EvolutionVariableDescription
import org.openapitools.model.EvolutionVariableName
import org.openapitools.model.VersionGroupSummary
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
 * @param name The name for this resource.
 * @param symbol The symbol used for this variable in evolution condition expressions.
 * @param versionGroup The version group in which this variable was introduced.
 * @param names The name of this resource listed in different languages.
 * @param descriptions The description of this resource listed in different languages.
 * @param dataType The data type of this variable.
 * @param source The source of the variable value.
 */
data class EvolutionVariableDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Size(max=10)
    @Schema(required = true, description = "The symbol used for this variable in evolution condition expressions.")
    @param:JsonProperty("symbol", required = true)
    @get:JsonProperty("symbol", required = true) val symbol: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The version group in which this variable was introduced.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<EvolutionVariableName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The description of this resource listed in different languages.")
    @param:JsonProperty("descriptions", required = true)
    @get:JsonProperty("descriptions", required = true) val descriptions: kotlin.collections.List<EvolutionVariableDescription>,

    @get:Size(max=20)
    @Schema(description = "The data type of this variable.")
    @param:JsonProperty("data_type")
    @get:JsonProperty("data_type") val dataType: kotlin.String? = null,

    @get:Size(max=20)
    @Schema(description = "The source of the variable value.")
    @param:JsonProperty("source")
    @get:JsonProperty("source") val source: kotlin.String? = null
) {

}

