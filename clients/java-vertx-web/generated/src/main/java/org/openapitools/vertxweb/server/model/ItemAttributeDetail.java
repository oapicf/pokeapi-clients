package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.ItemAttributeDescription;
import org.openapitools.vertxweb.server.model.ItemAttributeName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemAttributeDetail   {
  
  private Integer id;
  private String name;
  private List<ItemAttributeDescription> descriptions = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> items = new ArrayList<>();
  private List<ItemAttributeName> names = new ArrayList<>();

  public ItemAttributeDetail () {

  }

  public ItemAttributeDetail (Integer id, String name, List<ItemAttributeDescription> descriptions, List<AbilityDetailPokemonInnerPokemon> items, List<ItemAttributeName> names) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.items = items;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("descriptions")
  public List<ItemAttributeDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<ItemAttributeDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("items")
  public List<AbilityDetailPokemonInnerPokemon> getItems() {
    return items;
  }
  public void setItems(List<AbilityDetailPokemonInnerPokemon> items) {
    this.items = items;
  }

    
  @JsonProperty("names")
  public List<ItemAttributeName> getNames() {
    return names;
  }
  public void setNames(List<ItemAttributeName> names) {
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
    ItemAttributeDetail itemAttributeDetail = (ItemAttributeDetail) o;
    return Objects.equals(id, itemAttributeDetail.id) &&
        Objects.equals(name, itemAttributeDetail.name) &&
        Objects.equals(descriptions, itemAttributeDetail.descriptions) &&
        Objects.equals(items, itemAttributeDetail.items) &&
        Objects.equals(names, itemAttributeDetail.names);
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
