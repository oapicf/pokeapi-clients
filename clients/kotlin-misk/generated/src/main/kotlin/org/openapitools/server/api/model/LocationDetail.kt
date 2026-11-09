package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaSummary
import org.openapitools.server.api.model.LocationGameIndex
import org.openapitools.server.api.model.LocationName
import org.openapitools.server.api.model.RegionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The region this location can be found in. */
    val region: RegionSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<LocationName>,
    /** A list of game indices relevent to this location by generation. */
    val gameIndices: kotlin.collections.List<LocationGameIndex>,
    /** Areas that can be found within this location. */
    val areas: kotlin.collections.List<LocationAreaSummary>
)
