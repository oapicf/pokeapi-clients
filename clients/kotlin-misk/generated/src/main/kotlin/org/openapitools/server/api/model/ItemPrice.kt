package org.openapitools.server.api.model

import org.openapitools.server.api.model.CurrencySummary
import org.openapitools.server.api.model.VersionGroupSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemPrice(
    /** The currency used for this price. */
    val currency: CurrencySummary,
    /** The version group to which this price applies. */
    val versionGroup: VersionGroupSummary,
    /** The purchase price in this currency and version group, or null if unavailable. */
    val purchasePrice: kotlin.Int? = null,
    /** The sell price in this currency and version group, or null if unavailable. */
    val sellPrice: kotlin.Int? = null
)
