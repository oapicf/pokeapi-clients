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
 * @param id The identifier for this resource.
 * @param name The name for this resource.
 * @param region The region this location can be found in.
 * @param names The name of this resource listed in different languages.
 * @param gameIndices A list of game indices relevent to this location by generation.
 * @param areas Areas that can be found within this location.
 */
data class LocationDetail(

    @Schema(required = true, readOnly = true, description = "The identifier for this resource.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.Int,

    @get:Size(max=200)
    @Schema(required = true, description = "The name for this resource.")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The region this location can be found in.")
    @param:JsonProperty("region", required = true)
    @get:JsonProperty("region", required = true) val region: RegionSummary?,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "The name of this resource listed in different languages.")
    @param:JsonProperty("names", required = true)
    @get:JsonProperty("names", required = true) val names: kotlin.collections.List<LocationName>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "A list of game indices relevent to this location by generation.")
    @param:JsonProperty("game_indices", required = true)
    @get:JsonProperty("game_indices", required = true) val gameIndices: kotlin.collections.List<LocationGameIndex>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Areas that can be found within this location.")
    @param:JsonProperty("areas", required = true)
    @get:JsonProperty("areas", required = true) val areas: kotlin.collections.List<LocationAreaSummary>
) {

}

