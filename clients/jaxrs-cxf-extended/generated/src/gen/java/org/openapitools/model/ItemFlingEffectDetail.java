package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemFlingEffectEffectText;
import org.openapitools.model.ItemSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemFlingEffectDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ItemFlingEffectEffectText> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ItemSummary> items = new ArrayList<>();
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
  public ItemFlingEffectDetail id(Integer id) {
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
  public ItemFlingEffectDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get effectEntries
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid ItemFlingEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
 public void setEffectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
  public ItemFlingEffectDetail effectEntries(List<@Valid ItemFlingEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   */
  public ItemFlingEffectDetail addEffectEntriesItem(ItemFlingEffectEffectText effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
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
  public ItemFlingEffectDetail items(List<@Valid ItemSummary> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
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

