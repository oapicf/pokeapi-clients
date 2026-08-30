package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.model.PokemonShapeDetailNamesInner;
import org.openapitools.model.PokemonSpeciesSummary;

/**
 * PokemonShapeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T01:55:58.248058654Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PokemonShapeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("awesome_names")
  private List<@Valid PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid PokemonShapeDetailNamesInner> names = new ArrayList<>();

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

  public PokemonShapeDetail name(String name) {
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

   /**
   * Get awesomeNames
   * @return awesomeNames
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
    return awesomeNames;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonShapeDetailNamesInner> getNames() {
    return names;
  }

   /**
   * Get pokemonSpecies
   * @return pokemonSpecies
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

