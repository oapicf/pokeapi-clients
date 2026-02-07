package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategoryName;
import org.openapitools.model.ItemPocketSummary;
import org.openapitools.model.ItemSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemCategoryDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemCategoryDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid ItemSummary> items = new ArrayList<>();

  @Valid
  private List<@Valid ItemCategoryName> names = new ArrayList<>();

  private ItemPocketSummary pocket;

  public ItemCategoryDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ItemCategoryDetail(Integer id, String name, List<@Valid ItemSummary> items, List<@Valid ItemCategoryName> names, ItemPocketSummary pocket) {
    this.id = id;
    this.name = name;
    this.items = items;
    this.names = names;
    this.pocket = pocket;
  }

  public ItemCategoryDetail id(Integer id) {
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

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemCategoryDetail name(String name) {
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

  public void setName(String name) {
    this.name = name;
  }

  public ItemCategoryDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  public ItemCategoryDetail addItemsItem(ItemSummary itemsItem) {
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
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid ItemSummary> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  public ItemCategoryDetail names(List<@Valid ItemCategoryName> names) {
    this.names = names;
    return this;
  }

  public ItemCategoryDetail addNamesItem(ItemCategoryName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid ItemCategoryName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemCategoryName> names) {
    this.names = names;
  }

  public ItemCategoryDetail pocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
    return this;
  }

  /**
   * Get pocket
   * @return pocket
   */
  @NotNull @Valid 
  @Schema(name = "pocket", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pocket")
  public ItemPocketSummary getPocket() {
    return pocket;
  }

  public void setPocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCategoryDetail itemCategoryDetail = (ItemCategoryDetail) o;
    return Objects.equals(this.id, itemCategoryDetail.id) &&
        Objects.equals(this.name, itemCategoryDetail.name) &&
        Objects.equals(this.items, itemCategoryDetail.items) &&
        Objects.equals(this.names, itemCategoryDetail.names) &&
        Objects.equals(this.pocket, itemCategoryDetail.pocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, items, names, pocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCategoryDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pocket: ").append(toIndentedString(pocket)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

