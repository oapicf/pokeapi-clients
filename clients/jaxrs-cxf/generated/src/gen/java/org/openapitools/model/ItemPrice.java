package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencySummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemPrice  {
  
 /**
  * The purchase price in this currency and version group, or null if unavailable.
  */
  @ApiModelProperty(value = "The purchase price in this currency and version group, or null if unavailable.")

  private Integer purchasePrice;

 /**
  * The sell price in this currency and version group, or null if unavailable.
  */
  @ApiModelProperty(value = "The sell price in this currency and version group, or null if unavailable.")

  private Integer sellPrice;

 /**
  * The currency used for this price.
  */
  @ApiModelProperty(required = true, value = "The currency used for this price.")

  @Valid

  private CurrencySummary currency;

 /**
  * The version group to which this price applies.
  */
  @ApiModelProperty(required = true, value = "The version group to which this price applies.")

  @Valid

  private VersionGroupSummary versionGroup;
 /**
   * The purchase price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return purchasePrice
  **/
  @JsonProperty("purchase_price")
 @Min(-2147483648) @Max(2147483647)  public Integer getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public ItemPrice purchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

 /**
   * The sell price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return sellPrice
  **/
  @JsonProperty("sell_price")
 @Min(-2147483648) @Max(2147483647)  public Integer getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
  }

  public ItemPrice sellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

 /**
   * The currency used for this price.
   * @return currency
  **/
  @JsonProperty("currency")
  @NotNull
  public CurrencySummary getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencySummary currency) {
    this.currency = currency;
  }

  public ItemPrice currency(CurrencySummary currency) {
    this.currency = currency;
    return this;
  }

 /**
   * The version group to which this price applies.
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public ItemPrice versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPrice itemPrice = (ItemPrice) o;
    return Objects.equals(this.purchasePrice, itemPrice.purchasePrice) &&
        Objects.equals(this.sellPrice, itemPrice.sellPrice) &&
        Objects.equals(this.currency, itemPrice.currency) &&
        Objects.equals(this.versionGroup, itemPrice.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchasePrice, sellPrice, currency, versionGroup);
  }

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

