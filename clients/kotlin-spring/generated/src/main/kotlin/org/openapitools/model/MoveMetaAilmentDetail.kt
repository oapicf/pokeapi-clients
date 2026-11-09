package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.MoveMetaAilmentName
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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param moves A list of moves that cause this ailment.
 * @param names The name of this resource listed in different languages.
 */
data class MoveMetaAilmentDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of moves that cause this ailment.")
    @param:JsonProperty("moves", required = true)
    @get:JsonProperty("moves", required = true) val moves: kotlin.collections.List<MoveSummary>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<MoveMetaAilmentName>
) {

}

