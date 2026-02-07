package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EggGroupDetailPokemonSpeciesInner;
import org.openapitools.model.EggGroupName;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class EggGroupDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid EggGroupName> names = new ArrayList<>();

  private List<@Valid EggGroupDetailPokemonSpeciesInner> pokemonSpecies = new ArrayList<>();

  /**
   **/
  public EggGroupDetail id(Integer id) {
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
  public EggGroupDetail name(String name) {
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
  public EggGroupDetail names(List<@Valid EggGroupName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid EggGroupName> getNames() {
    return names;
  }
  public void setNames(List<@Valid EggGroupName> names) {
    this.names = names;
  }

  public EggGroupDetail addNamesItem(EggGroupName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public EggGroupDetail pokemonSpecies(List<@Valid EggGroupDetailPokemonSpeciesInner> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species")
  @NotNull
  public List<@Valid EggGroupDetailPokemonSpeciesInner> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<@Valid EggGroupDetailPokemonSpeciesInner> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public EggGroupDetail addPokemonSpeciesItem(EggGroupDetailPokemonSpeciesInner pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
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
    EggGroupDetail eggGroupDetail = (EggGroupDetail) o;
    return Objects.equals(this.id, eggGroupDetail.id) &&
        Objects.equals(this.name, eggGroupDetail.name) &&
        Objects.equals(this.names, eggGroupDetail.names) &&
        Objects.equals(this.pokemonSpecies, eggGroupDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EggGroupDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

