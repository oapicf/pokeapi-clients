package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemFlingEffectDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid ItemFlingEffectEffectText> effectEntries = new ArrayList<>();

  private List<@Valid ItemSummary> items = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public ItemFlingEffectDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * The name for this resource.
   **/
  public ItemFlingEffectDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The result of this fling effect listed in different languages.
   **/
  public ItemFlingEffectDetail effectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The result of this fling effect listed in different languages.")
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public ItemFlingEffectDetail addEffectEntriesItem(ItemFlingEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }


  /**
   * A list of items that have this fling effect.
   **/
  public ItemFlingEffectDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of items that have this fling effect.")
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemSummary> getItems() {
    return items;
  }
  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  public ItemFlingEffectDetail addItemsItem(ItemSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

