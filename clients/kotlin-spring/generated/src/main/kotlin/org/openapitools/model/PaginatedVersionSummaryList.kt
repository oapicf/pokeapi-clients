package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.VersionSummary
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
data class PaginatedVersionSummaryList(

    @Schema(example = "123", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "http://api.example.org/accounts/?offset=400&limit=100", description = "")
    @get:JsonProperty("next") val next: java.net.URI? = null,

    @field:Valid
    @Schema(example = "http://api.example.org/accounts/?offset=200&limit=100", description = "")
    @get:JsonProperty("previous") val previous: java.net.URI? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<VersionSummary>? = null
) {

}

