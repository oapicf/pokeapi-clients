package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.EvolutionTriggerName;
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
 * EvolutionTriggerDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionTriggerDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("names")
  
  private List<EvolutionTriggerName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  
  private List<AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

  public EvolutionTriggerDetail id(Integer id) {
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

  public EvolutionTriggerDetail name(String name) {
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

  public EvolutionTriggerDetail names(List<EvolutionTriggerName> names) {
    this.names = names;
    return this;
  }

  public EvolutionTriggerDetail addNamesItem(EvolutionTriggerName namesItem) {
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
  public List<EvolutionTriggerName> getNames() {
    return names;
  }

  public void setNames(List<EvolutionTriggerName> names) {
    this.names = names;
  }

  public EvolutionTriggerDetail pokemonSpecies(List<AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public EvolutionTriggerDetail addPokemonSpeciesItem(AbilityDetailPokemonInnerPokemon pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  /**
   * Get pokemonSpecies
   * @return pokemonSpecies
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionTriggerDetail evolutionTriggerDetail = (EvolutionTriggerDetail) o;
    return Objects.equals(this.id, evolutionTriggerDetail.id) &&
        Objects.equals(this.name, evolutionTriggerDetail.name) &&
        Objects.equals(this.names, evolutionTriggerDetail.names) &&
        Objects.equals(this.pokemonSpecies, evolutionTriggerDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionTriggerDetail {\n");
    
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

