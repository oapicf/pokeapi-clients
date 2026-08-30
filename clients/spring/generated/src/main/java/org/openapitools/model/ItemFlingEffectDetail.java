package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ItemFlingEffectDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemFlingEffectDetail {

  private Integer id;

  private String name;

  private List<@Valid ItemFlingEffectEffectText> effectEntries = new ArrayList<>();

  private List<@Valid ItemSummary> items = new ArrayList<>();

  public ItemFlingEffectDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemFlingEffectDetail(Integer id, String name, List<@Valid ItemFlingEffectEffectText> effectEntries, List<@Valid ItemSummary> items) {
    this.id = id;
    this.name = name;
    this.effectEntries = effectEntries;
    this.items = items;
  }

  public ItemFlingEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  public ItemFlingEffectDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public ItemFlingEffectDetail effectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ItemFlingEffectDetail addEffectEntriesItem(ItemFlingEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * Get effectEntries
   * @return effectEntries
   */
  @Valid 
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty("effect_entries")
  public void setEffectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemFlingEffectDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  public ItemFlingEffectDetail addItemsItem(ItemSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ItemSummary> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemFlingEffectDetail itemFlingEffectDetail = (ItemFlingEffectDetail) o;
    return Objects.equals(this.id, itemFlingEffectDetail.id) &&
        Objects.equals(this.name, itemFlingEffectDetail.name) &&
        Objects.equals(this.effectEntries, itemFlingEffectDetail.effectEntries) &&
        Objects.equals(this.items, itemFlingEffectDetail.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, effectEntries, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFlingEffectDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

