package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.MoveMetaAilmentSummary
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
 * @param count 
 * @param next 
 * @param previous 
 * @param results 
 */
data class PaginatedMoveMetaAilmentSummaryList(

    @Schema(example = "123", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("count")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "http://api.example.org/accounts/?offset=400&limit=100", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("next")
    @get:JsonProperty("next") val next: java.net.URI? = null,

    @field:Valid
    @Schema(example = "http://api.example.org/accounts/?offset=200&limit=100", description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("previous")
    @get:JsonProperty("previous") val previous: java.net.URI? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("results")
    @get:JsonProperty("results") val results: kotlin.collections.List<MoveMetaAilmentSummary>? = null
) {

}

