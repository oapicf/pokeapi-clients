package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LocationAreaSummary
import org.openapitools.model.LocationGameIndex
import org.openapitools.model.LocationName
import org.openapitools.model.RegionSummary
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
 * @param region 
 * @param names 
 * @param gameIndices 
 * @param areas 
 */
data class LocationDetail(

    @Schema(example = "null", required = true, readOnly = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("region", required = true) val region: RegionSummary,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LocationName>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<LocationGameIndex>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("areas", required = true) val areas: kotlin.collections.List<LocationAreaSummary>
) {

}

