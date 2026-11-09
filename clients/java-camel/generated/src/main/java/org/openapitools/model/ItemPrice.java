package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencySummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ItemPrice
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class ItemPrice {

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> purchasePrice = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> sellPrice = JsonNullable.<Integer>undefined();

  private CurrencySummary currency;

  private VersionGroupSummary versionGroup;

  public ItemPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemPrice(CurrencySummary currency, VersionGroupSummary versionGroup) {
    this.currency = currency;
    this.versionGroup = versionGroup;
  }

  public ItemPrice purchasePrice(Integer purchasePrice) {
    this.purchasePrice = JsonNullable.of(purchasePrice);
    return this;
  }

  /**
   * The purchase price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return purchasePrice
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "purchase_price", description = "The purchase price in this currency and version group, or null if unavailable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchase_price")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(JsonNullable<Integer> purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public ItemPrice sellPrice(Integer sellPrice) {
    this.sellPrice = JsonNullable.of(sellPrice);
    return this;
  }

  /**
   * The sell price in this currency and version group, or null if unavailable.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return sellPrice
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "sell_price", description = "The sell price in this currency and version group, or null if unavailable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sell_price")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(JsonNullable<Integer> sellPrice) {
    this.sellPrice = sellPrice;
  }

  public ItemPrice currency(CurrencySummary currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency used for this price.
   * @return currency
   */
  @NotNull @Valid 
  @Schema(name = "currency", description = "The currency used for this price.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public CurrencySummary getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencySummary currency) {
    this.currency = currency;
  }

  public ItemPrice versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group to which this price applies.
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group to which this price applies.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return equalsNullable(this.purchasePrice, itemPrice.purchasePrice) &&
        equalsNullable(this.sellPrice, itemPrice.sellPrice) &&
        Objects.equals(this.currency, itemPrice.currency) &&
        Objects.equals(this.versionGroup, itemPrice.versionGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(purchasePrice), hashCodeNullable(sellPrice), currency, versionGroup);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

