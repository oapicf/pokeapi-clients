package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.model.PokemonShapeDetailNamesInner;
import org.openapitools.model.PokemonSpeciesSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonShapeDetailNamesInner> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
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

  public PokemonShapeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get awesomeNames
   * @return awesomeNames
  **/
  @JsonProperty("awesome_names")
  public List<PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail awesomeNames(List<PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeDetailAwesomeNamesInner awesomeNamesItem) {
    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<PokemonShapeDetailNamesInner> getNames() {
    return names;
  }

  public void setNames(List<PokemonShapeDetailNamesInner> names) {
    this.names = names;
  }

  public PokemonShapeDetail names(List<PokemonShapeDetailNamesInner> names) {
    this.names = names;
    return this;
  }

  public PokemonShapeDetail addNamesItem(PokemonShapeDetailNamesInner namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PokemonShapeDetail pokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public PokemonShapeDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
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
    PokemonShapeDetail pokemonShapeDetail = (PokemonShapeDetail) o;
    return Objects.equals(this.id, pokemonShapeDetail.id) &&
        Objects.equals(this.name, pokemonShapeDetail.name) &&
        Objects.equals(this.awesomeNames, pokemonShapeDetail.awesomeNames) &&
        Objects.equals(this.names, pokemonShapeDetail.names) &&
        Objects.equals(this.pokemonSpecies, pokemonShapeDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, awesomeNames, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    awesomeNames: ").append(toIndentedString(awesomeNames)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

