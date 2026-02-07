package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonHabitatName;
import org.openapitools.model.PokemonSpeciesSummary;

/**
 * PokemonHabitatDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonHabitatDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("names")
  private List<@Valid PokemonHabitatName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public PokemonHabitatDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonHabitatDetail names(List<@Valid PokemonHabitatName> names) {
    this.names = names;
    return this;
  }

  public PokemonHabitatDetail addNamesItem(PokemonHabitatName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonHabitatName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonHabitatName> names) {
    this.names = names;
  }

  public PokemonHabitatDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public PokemonHabitatDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

   /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
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
    PokemonHabitatDetail pokemonHabitatDetail = (PokemonHabitatDetail) o;
    return Objects.equals(this.id, pokemonHabitatDetail.id) &&
        Objects.equals(this.name, pokemonHabitatDetail.name) &&
        Objects.equals(this.names, pokemonHabitatDetail.names) &&
        Objects.equals(this.pokemonSpecies, pokemonHabitatDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonHabitatDetail {\n");
    
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

