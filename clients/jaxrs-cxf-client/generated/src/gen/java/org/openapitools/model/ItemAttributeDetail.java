package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemAttributeDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<ItemAttributeDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> items = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<ItemAttributeName> names = new ArrayList<>();
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

  public ItemAttributeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public ItemAttributeDetail descriptions(List<ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ItemAttributeDetail addDescriptionsItem(ItemAttributeDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<AbilityDetailPokemonInnerPokemon> getItems() {
    return items;
  }

  public void setItems(List<AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
  }

  public ItemAttributeDetail items(List<AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
    return this;
  }

  public ItemAttributeDetail addItemsItem(AbilityDetailPokemonInnerPokemon itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<ItemAttributeName> getNames() {
    return names;
  }

  public void setNames(List<ItemAttributeName> names) {
    this.names = names;
  }

  public ItemAttributeDetail names(List<ItemAttributeName> names) {
    this.names = names;
    return this;
  }

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

