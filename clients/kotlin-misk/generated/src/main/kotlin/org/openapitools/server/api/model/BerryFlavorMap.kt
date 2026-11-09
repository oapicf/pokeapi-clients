package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorMap(
    /** How powerful the referenced flavor is for this berry. */
    val potency: kotlin.Int,
    /** The referenced berry flavor. */
    val flavor: BerryFlavorSummary
)
