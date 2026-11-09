package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencySummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemPrice   {
  
  private Integer purchasePrice;
  private Integer sellPrice;
  private CurrencySummary currency;
  private VersionGroupSummary versionGroup;

  /**
   * The purchase price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The purchase price in this currency and version group, or null if unavailable.")
  @JsonProperty("purchase_price")
 @Min(-2147483648) @Max(2147483647)  public Integer getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  /**
   * The sell price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The sell price in this currency and version group, or null if unavailable.")
  @JsonProperty("sell_price")
 @Min(-2147483648) @Max(2147483647)  public Integer getSellPrice() {
    return sellPrice;
  }
  public void setSellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
  }

  /**
   * The currency used for this price.
   **/
  
  @ApiModelProperty(required = true, value = "The currency used for this price.")
  @JsonProperty("currency")
  @NotNull
  @Valid
  public CurrencySummary getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencySummary currency) {
    this.currency = currency;
  }

  /**
   * The version group to which this price applies.
   **/
  
  @ApiModelProperty(required = true, value = "The version group to which this price applies.")
  @JsonProperty("version_group")
  @NotNull
  @Valid
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

