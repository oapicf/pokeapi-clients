package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemFlingEffectDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<ItemFlingEffectEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<ItemSummary> items = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemFlingEffectDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemFlingEffectDetail effectEntries(List<ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public ItemFlingEffectDetail addEffectEntriesItem(ItemFlingEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<ItemSummary> getItems() {
    return items;
  }

  public void setItems(List<ItemSummary> items) {
    this.items = items;
  }

  public ItemFlingEffectDetail items(List<ItemSummary> items) {
    this.items = items;
    return this;
  }

  public ItemFlingEffectDetail addItemsItem(ItemSummary itemsItem) {
    this.items.add(itemsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

