package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencySummary;
import org.openapitools.model.VersionGroupSummary;

@Canonical
class ItemPrice {
    /* The purchase price in this currency and version group, or null if unavailable. */
    Integer purchasePrice
    /* The sell price in this currency and version group, or null if unavailable. */
    Integer sellPrice
    /* The currency used for this price. */
    CurrencySummary currency
    /* The version group to which this price applies. */
    VersionGroupSummary versionGroup
}
