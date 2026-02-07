package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.model.PokemonShapeDetailNamesInner;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid PokemonShapeDetailNamesInner> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
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
  @NotNull
  public List<@Valid PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
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
  @NotNull
  public List<@Valid PokemonShapeDetailNamesInner> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonShapeDetailNamesInner> names) {
    this.names = names;
  }

  public PokemonShapeDetail names(List<@Valid PokemonShapeDetailNamesInner> names) {
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
  @NotNull
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }

  public PokemonShapeDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
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

