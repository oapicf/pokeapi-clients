package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategoryName;
import org.openapitools.model.ItemPocketSummary;
import org.openapitools.model.ItemSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemCategoryDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemSummary> items = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid ItemCategoryName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ItemPocketSummary pocket;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemSummary> getItems() {
    return items;
  }

  public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  public ItemCategoryDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  public ItemCategoryDetail addItemsItem(ItemSummary itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemCategoryName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ItemCategoryName> names) {
    this.names = names;
  }

  public ItemCategoryDetail names(List<@Valid ItemCategoryName> names) {
    this.names = names;
    return this;
  }

  public ItemCategoryDetail addNamesItem(ItemCategoryName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pocket
   * @return pocket
  **/
  @JsonProperty("pocket")
  @NotNull
  public ItemPocketSummary getPocket() {
    return pocket;
  }

  public void setPocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
  }

  public ItemCategoryDetail pocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

