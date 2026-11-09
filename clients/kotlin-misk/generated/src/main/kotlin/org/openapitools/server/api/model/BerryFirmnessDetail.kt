package org.openapitools.server.api.model

import org.openapitools.server.api.model.BerryFirmnessName
import org.openapitools.server.api.model.BerrySummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BerryFirmnessDetail(
    /** The identifier for this resource. */
    val id: kotlin.Int,
    /** The name for this resource. */
    val name: kotlin.String,
    /** A list of the berries with this firmness. */
    val berries: kotlin.collections.List<BerrySummary>,
    /** The name of this resource listed in different languages. */
    val names: kotlin.collections.List<BerryFirmnessName>
)
