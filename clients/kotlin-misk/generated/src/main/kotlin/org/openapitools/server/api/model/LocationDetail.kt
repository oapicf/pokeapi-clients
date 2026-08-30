package org.openapitools.server.api.model

import org.openapitools.server.api.model.LocationAreaSummary
import org.openapitools.server.api.model.LocationGameIndex
import org.openapitools.server.api.model.LocationName
import org.openapitools.server.api.model.RegionSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LocationDetail(
    val id: kotlin.Int,
    val name: kotlin.String,
    val region: RegionSummary,
    val names: kotlin.collections.List<LocationName>,
    val gameIndices: kotlin.collections.List<LocationGameIndex>,
    val areas: kotlin.collections.List<LocationAreaSummary>
)
