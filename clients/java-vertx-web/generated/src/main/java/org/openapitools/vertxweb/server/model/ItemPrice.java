package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CurrencySummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemPrice   {
  
  private Integer purchasePrice;
  private Integer sellPrice;
  private CurrencySummary currency;
  private VersionGroupSummary versionGroup;

  public ItemPrice () {

  }

  public ItemPrice (Integer purchasePrice, Integer sellPrice, CurrencySummary currency, VersionGroupSummary versionGroup) {
    this.purchasePrice = purchasePrice;
    this.sellPrice = sellPrice;
    this.currency = currency;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("purchase_price")
  public Integer getPurchasePrice() {
    return purchasePrice;
  }
  public void setPurchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

    
  @JsonProperty("sell_price")
  public Integer getSellPrice() {
    return sellPrice;
  }
  public void setSellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
  }

    
  @JsonProperty("currency")
  public CurrencySummary getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencySummary currency) {
    this.currency = currency;
  }

    
  @JsonProperty("version_group")
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
    return Objects.equals(purchasePrice, itemPrice.purchasePrice) &&
        Objects.equals(sellPrice, itemPrice.sellPrice) &&
        Objects.equals(currency, itemPrice.currency) &&
        Objects.equals(versionGroup, itemPrice.versionGroup);
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
