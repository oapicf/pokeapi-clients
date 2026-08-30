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

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=100)
    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("region")
    @get:JsonProperty("region", required = true) val region: RegionSummary,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("names")
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LocationName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("game_indices")
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<LocationGameIndex>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("areas")
    @get:JsonProperty("areas", required = true) val areas: kotlin.collections.List<LocationAreaSummary>
) {

}

