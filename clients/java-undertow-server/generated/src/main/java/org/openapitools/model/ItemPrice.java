/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencySummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemPrice   {
  
  private Integer purchasePrice;
  private Integer sellPrice;
  private CurrencySummary currency;
  private VersionGroupSummary versionGroup;

  /**
   * The purchase price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public ItemPrice purchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
    return this;
  }

  
  @ApiModelProperty(value = "The purchase price in this currency and version group, or null if unavailable.")
  @JsonProperty("purchase_price")
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
   */
  public ItemPrice sellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

  
  @ApiModelProperty(value = "The sell price in this currency and version group, or null if unavailable.")
  @JsonProperty("sell_price")
  public Integer getSellPrice() {
    return sellPrice;
  }
  public void setSellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
  }

  /**
   * The currency used for this price.
   */
  public ItemPrice currency(CurrencySummary currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The currency used for this price.")
  @JsonProperty("currency")
  public CurrencySummary getCurrency() {
    return currency;
  }
  public void setCurrency(CurrencySummary currency) {
    this.currency = currency;
  }

  /**
   * The version group to which this price applies.
   */
  public ItemPrice versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group to which this price applies.")
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

