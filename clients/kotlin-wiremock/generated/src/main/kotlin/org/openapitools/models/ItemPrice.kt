@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemPrice(
    @field:JsonProperty("currency")
    val currency: CurrencySummary,

    @field:JsonProperty("version_group")
    val versionGroup: VersionGroupSummary,

    @field:JsonProperty("purchase_price")
    val purchasePrice: kotlin.Int? = null,

    @field:JsonProperty("sell_price")
    val sellPrice: kotlin.Int? = null,

)
