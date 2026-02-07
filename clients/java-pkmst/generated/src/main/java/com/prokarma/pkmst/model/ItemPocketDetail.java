package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ItemCategorySummary;
import com.prokarma.pkmst.model.ItemPocketName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ItemPocketDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemPocketDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("categories")
  
  private List<ItemCategorySummary> categories = new ArrayList<>();

  @JsonProperty("names")
  
  private List<ItemPocketName> names = new ArrayList<>();

  public ItemPocketDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemPocketDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemPocketDetail categories(List<ItemCategorySummary> categories) {
    this.categories = categories;
    return this;
  }

  public ItemPocketDetail addCategoriesItem(ItemCategorySummary categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
   */
  @ApiModelProperty(required = true, value = "")
  public List<ItemCategorySummary> getCategories() {
    return categories;
  }

  public void setCategories(List<ItemCategorySummary> categories) {
    this.categories = categories;
  }

  public ItemPocketDetail names(List<ItemPocketName> names) {
    this.names = names;
    return this;
  }

  public ItemPocketDetail addNamesItem(ItemPocketName namesItem) {
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
  @ApiModelProperty(required = true, value = "")
  public List<ItemPocketName> getNames() {
    return names;
  }

  public void setNames(List<ItemPocketName> names) {
    this.names = names;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

