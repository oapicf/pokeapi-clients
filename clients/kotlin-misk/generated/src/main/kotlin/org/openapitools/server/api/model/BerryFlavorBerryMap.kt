package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerrySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorBerryMap(
    /** How powerful the referenced flavor is for this berry. */
    val potency: kotlin.Int,
    /** The berry with the referenced flavor. */
    val berry: BerrySummary
)
