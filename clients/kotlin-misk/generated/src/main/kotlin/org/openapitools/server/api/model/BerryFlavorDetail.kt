package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFlavorBerryMap
import org.openapitools.server.api.model.BerryFlavorName
import org.openapitools.server.api.model.ContestTypeSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFlavorDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of the berries with this flavor. */
    val berries: kotlin.collections.List<BerryFlavorBerryMap>,
    /** The contest type that correlates with this berry flavor. */
    val contestType: ContestTypeSummary,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<BerryFlavorName>
)
