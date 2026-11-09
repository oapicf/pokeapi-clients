package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CurrencySummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemPrice   {

    private Integer purchasePrice;
    private Integer sellPrice;
    private CurrencySummary currency;
    private VersionGroupSummary versionGroup;

    /**
     * Default constructor.
     */
    public ItemPrice() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemPrice.
     *
     * @param purchasePrice The purchase price in this currency and version group, or null if unavailable.
     * @param sellPrice The sell price in this currency and version group, or null if unavailable.
     * @param currency The currency used for this price.
     * @param versionGroup The version group to which this price applies.
     */
    public ItemPrice(
        Integer purchasePrice, 
        Integer sellPrice, 
        CurrencySummary currency, 
        VersionGroupSummary versionGroup
    ) {
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
        this.currency = currency;
        this.versionGroup = versionGroup;
    }



    /**
     * The purchase price in this currency and version group, or null if unavailable.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return purchasePrice
     */
    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * The sell price in this currency and version group, or null if unavailable.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return sellPrice
     */
    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * The currency used for this price.
     * @return currency
     */
    public CurrencySummary getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencySummary currency) {
        this.currency = currency;
    }

    /**
     * The version group to which this price applies.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemPrice {\n");
        
        sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
        sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

