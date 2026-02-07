package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonColorName;
import org.openapitools.model.PokemonSpeciesSummary;

/**
 * PokemonColorDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonColorDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("names")
  private List<@Valid PokemonColorName> names = new ArrayList<>();

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

  public PokemonColorDetail name(String name) {
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

  public PokemonColorDetail names(List<@Valid PokemonColorName> names) {
    this.names = names;
    return this;
  }

  public PokemonColorDetail addNamesItem(PokemonColorName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonColorName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonColorName> names) {
    this.names = names;
  }

  public PokemonColorDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public PokemonColorDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
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
    PokemonColorDetail pokemonColorDetail = (PokemonColorDetail) o;
    return Objects.equals(this.id, pokemonColorDetail.id) &&
        Objects.equals(this.name, pokemonColorDetail.name) &&
        Objects.equals(this.names, pokemonColorDetail.names) &&
        Objects.equals(this.pokemonSpecies, pokemonColorDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonColorDetail {\n");
    
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

