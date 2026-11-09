package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CurrencySummary
import org.openapitools.model.VersionGroupSummary
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
 * @param currency The currency used for this price.
 * @param versionGroup The version group to which this price applies.
 * @param purchasePrice The purchase price in this currency and version group, or null if unavailable.
 * @param sellPrice The sell price in this currency and version group, or null if unavailable.
 */
data class ItemPrice(

    @field:Valid
    @Schema(required = true, description = "The currency used for this price.")
    @param:JsonProperty("currency", required = true)
    @get:JsonProperty("currency", required = true) val currency: CurrencySummary,

    @field:Valid
    @Schema(required = true, description = "The version group to which this price applies.")
    @param:JsonProperty("version_group", required = true)
    @get:JsonProperty("version_group", required = true) val versionGroup: VersionGroupSummary,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The purchase price in this currency and version group, or null if unavailable.")
    @param:JsonProperty("purchase_price")
    @get:JsonProperty("purchase_price") val purchasePrice: kotlin.Int? = null,

    @get:Min(value=-2147483648)
    @get:Max(value=2147483647)
    @Schema(description = "The sell price in this currency and version group, or null if unavailable.")
    @param:JsonProperty("sell_price")
    @get:JsonProperty("sell_price") val sellPrice: kotlin.Int? = null
) {

}

