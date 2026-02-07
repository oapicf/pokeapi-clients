package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemPocketDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<ItemCategorySummary> categories = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<ItemPocketName> names = new ArrayList<>();
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

  public ItemPocketDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get categories
   * @return categories
  **/
  @JsonProperty("categories")
  public List<ItemCategorySummary> getCategories() {
    return categories;
  }

  public void setCategories(List<ItemCategorySummary> categories) {
    this.categories = categories;
  }

  public ItemPocketDetail categories(List<ItemCategorySummary> categories) {
    this.categories = categories;
    return this;
  }

  public ItemPocketDetail addCategoriesItem(ItemCategorySummary categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<ItemPocketName> getNames() {
    return names;
  }

  public void setNames(List<ItemPocketName> names) {
    this.names = names;
  }

  public ItemPocketDetail names(List<ItemPocketName> names) {
    this.names = names;
    return this;
  }

  public ItemPocketDetail addNamesItem(ItemPocketName namesItem) {
    this.names.add(namesItem);
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
    ItemPocketDetail itemPocketDetail = (ItemPocketDetail) o;
    return Objects.equals(this.id, itemPocketDetail.id) &&
        Objects.equals(this.name, itemPocketDetail.name) &&
        Objects.equals(this.categories, itemPocketDetail.categories) &&
        Objects.equals(this.names, itemPocketDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, categories, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPocketDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

