package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorSummary
import org.openapitools.server.api.model.ContestTypeName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ContestTypeDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** The berry flavor that correlates with this contest type. */
    val berryFlavor: BerryFlavorSummary,
    /** The name of this contest type listed in different languages. */
    val names: kotlin.collections.List<ContestTypeName>
)
