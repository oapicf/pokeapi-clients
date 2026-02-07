package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemAttributeDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ItemAttributeDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> items = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ItemAttributeName> names = new ArrayList<>();
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
  public ItemAttributeDetail id(Integer id) {
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
  public ItemAttributeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get descriptions
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
 public void setDescriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
  public ItemAttributeDetail descriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   */
  public ItemAttributeDetail addDescriptionsItem(ItemAttributeDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ItemAttributeDetail items(List<@Valid AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ItemAttributeDetail addItemsItem(AbilityDetailPokemonInnerPokemon itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemAttributeName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid ItemAttributeName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public ItemAttributeDetail names(List<@Valid ItemAttributeName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public ItemAttributeDetail addNamesItem(ItemAttributeName namesItem) {
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
    ItemAttributeDetail itemAttributeDetail = (ItemAttributeDetail) o;
    return Objects.equals(this.id, itemAttributeDetail.id) &&
        Objects.equals(this.name, itemAttributeDetail.name) &&
        Objects.equals(this.descriptions, itemAttributeDetail.descriptions) &&
        Objects.equals(this.items, itemAttributeDetail.items) &&
        Objects.equals(this.names, itemAttributeDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, items, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

