package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemCategorySummary;
import org.openapitools.model.ItemPocketName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemPocketDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  private String name;

 /**
  * A list of item categories that are relevant to this item pocket.
  */
  @ApiModelProperty(required = true, value = "A list of item categories that are relevant to this item pocket.")
  private List<@Valid ItemCategorySummary> categories = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  private List<@Valid ItemPocketName> names = new ArrayList<>();
 /**
  * The identifier for this resource.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ItemPocketDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ItemPocketDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * A list of item categories that are relevant to this item pocket.
  * @return categories
  */
  @JsonProperty("categories")
  @NotNull
  public List<@Valid ItemCategorySummary> getCategories() {
    return categories;
  }

  /**
   * Sets the <code>categories</code> property.
   * <br><em>N.B. <code>categories</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCategories(List<@Valid ItemCategorySummary> categories) {
    this.categories = categories;
  }

  /**
   * Sets the <code>categories</code> property.
   * <br><em>N.B. <code>categories</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ItemPocketDetail categories(List<@Valid ItemCategorySummary> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Adds a new item to the <code>categories</code> list.
   * <br><em>N.B. <code>categories</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ItemPocketDetail addCategoriesItem(ItemCategorySummary categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

 /**
  * The name of this resource listed in different languages.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemPocketName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid ItemPocketName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ItemPocketDetail names(List<@Valid ItemPocketName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

