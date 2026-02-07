package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategoryName;
import org.openapitools.model.ItemPocketSummary;
import org.openapitools.model.ItemSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemCategoryDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid ItemSummary> items = new ArrayList<>();

  private List<@Valid ItemCategoryName> names = new ArrayList<>();

  private ItemPocketSummary pocket;

  /**
   **/
  public ItemCategoryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public ItemCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public ItemCategoryDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemSummary> getItems() {
    return items;
  }
  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  public ItemCategoryDetail addItemsItem(ItemSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   **/
  public ItemCategoryDetail names(List<@Valid ItemCategoryName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemCategoryName> getNames() {
    return names;
  }
  public void setNames(List<@Valid ItemCategoryName> names) {
    this.names = names;
  }

  public ItemCategoryDetail addNamesItem(ItemCategoryName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public ItemCategoryDetail pocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pocket")
  @NotNull
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

