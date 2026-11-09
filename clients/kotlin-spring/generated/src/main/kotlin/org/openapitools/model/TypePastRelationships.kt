package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenerationSummary
import org.openapitools.model.TypeRelationships
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
 * @param generation The last generation in which the referenced type had the listed damage relations
 * @param damageRelations The damage relations the referenced type had up to and including the listed generation
 */
data class TypePastRelationships(

    @field:Valid
    @Schema(required = true, description = "The last generation in which the referenced type had the listed damage relations")
    @param:JsonProperty("generation", required = true)
    @get:JsonProperty("generation", required = true) val generation: GenerationSummary,

    @field:Valid
    @Schema(required = true, description = "The damage relations the referenced type had up to and including the listed generation")
    @param:JsonProperty("damage_relations", required = true)
    @get:JsonProperty("damage_relations", required = true) val damageRelations: TypeRelationships
) {

}

