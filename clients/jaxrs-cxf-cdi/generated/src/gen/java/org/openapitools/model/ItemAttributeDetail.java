package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.ItemAttributeDescription;
import org.openapitools.model.ItemAttributeName;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ItemAttributeDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid ItemAttributeDescription> descriptions = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> items = new ArrayList<>();

  private List<@Valid ItemAttributeName> names = new ArrayList<>();

  /**
   **/
  public ItemAttributeDetail id(Integer id) {
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
  public ItemAttributeDetail name(String name) {
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
  public ItemAttributeDetail descriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<@Valid ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public ItemAttributeDetail addDescriptionsItem(ItemAttributeDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }


  /**
   **/
  public ItemAttributeDetail items(List<@Valid AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("items")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getItems() {
    return items;
  }
  public void setItems(List<@Valid AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
  }

  public ItemAttributeDetail addItemsItem(AbilityDetailPokemonInnerPokemon itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   **/
  public ItemAttributeDetail names(List<@Valid ItemAttributeName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid ItemAttributeName> getNames() {
    return names;
  }
  public void setNames(List<@Valid ItemAttributeName> names) {
    this.names = names;
  }

  public ItemAttributeDetail addNamesItem(ItemAttributeName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

