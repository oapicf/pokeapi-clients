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
import com.fasterxml.jackson.annotation.JsonFormat;
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
  public ItemCategoryDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
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
  public ItemCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid ItemSummary> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ItemSummary> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ItemCategoryDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ItemCategoryDetail addItemsItem(ItemSummary itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemCategoryName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid ItemCategoryName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public ItemCategoryDetail names(List<@Valid ItemCategoryName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public ItemCategoryDetail addNamesItem(ItemCategoryName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get pocket
  * @return pocket
  */
  @JsonProperty("pocket")
  @NotNull
  public ItemPocketSummary getPocket() {
    return pocket;
  }

  /**
   * Sets the <code>pocket</code> property.
   */
 public void setPocket(ItemPocketSummary pocket) {
    this.pocket = pocket;
  }

  /**
   * Sets the <code>pocket</code> property.
   */
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

