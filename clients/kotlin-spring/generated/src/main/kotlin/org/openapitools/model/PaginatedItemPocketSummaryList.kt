package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemPocketSummary
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
 * @param count The total number of resources available from this API.
 * @param results A list of API resources on this page.
 * @param next The URL for the next page in the list, or null if there is no next page.
 * @param previous The URL for the previous page in the list, or null if there is no previous page.
 */
data class PaginatedItemPocketSummaryList(

    @Schema(example = "100", required = true, description = "The total number of resources available from this API.")
    @param:JsonProperty("count", required = true)
    @get:JsonProperty("count", required = true) val count: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "A list of API resources on this page.")
    @param:JsonProperty("results", required = true)
    @get:JsonProperty("results", required = true) val results: kotlin.collections.List<ItemPocketSummary>,

    @field:Valid
    @Schema(example = "https://pokeapi.co/api/v2/item-pocket/?offset=40&limit=20", description = "The URL for the next page in the list, or null if there is no next page.")
    @param:JsonProperty("next")
    @get:JsonProperty("next") val next: java.net.URI? = null,

    @field:Valid
    @Schema(example = "https://pokeapi.co/api/v2/item-pocket/?offset=0&limit=20", description = "The URL for the previous page in the list, or null if there is no previous page.")
    @param:JsonProperty("previous")
    @get:JsonProperty("previous") val previous: java.net.URI? = null
) {

}

