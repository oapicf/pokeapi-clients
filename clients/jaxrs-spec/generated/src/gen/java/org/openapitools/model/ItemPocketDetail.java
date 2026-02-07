package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemPocketDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemPocketDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid ItemCategorySummary> categories = new ArrayList<>();
  private @Valid List<@Valid ItemPocketName> names = new ArrayList<>();

  public ItemPocketDetail() {
  }

  @JsonCreator
  public ItemPocketDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "categories") List<@Valid ItemCategorySummary> categories,
    @JsonProperty(required = true, value = "names") List<@Valid ItemPocketName> names
  ) {
    this.id = id;
    this.name = name;
    this.categories = categories;
    this.names = names;
  }

  /**
   **/
  public ItemPocketDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public ItemPocketDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public ItemPocketDetail categories(List<@Valid ItemCategorySummary> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "categories")
  @NotNull @Valid public List<@Valid ItemCategorySummary> getCategories() {
    return categories;
  }

  @JsonProperty(required = true, value = "categories")
  public void setCategories(List<@Valid ItemCategorySummary> categories) {
    this.categories = categories;
  }

  public ItemPocketDetail addCategoriesItem(ItemCategorySummary categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }

    this.categories.add(categoriesItem);
    return this;
  }

  public ItemPocketDetail removeCategoriesItem(ItemCategorySummary categoriesItem) {
    if (categoriesItem != null && this.categories != null) {
      this.categories.remove(categoriesItem);
    }

    return this;
  }
  /**
   **/
  public ItemPocketDetail names(List<@Valid ItemPocketName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid ItemPocketName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid ItemPocketName> names) {
    this.names = names;
  }

  public ItemPocketDetail addNamesItem(ItemPocketName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public ItemPocketDetail removeNamesItem(ItemPocketName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

