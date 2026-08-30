package org.openapitools.model;

import org.openapitools.model.PokemonShapeDetailAwesomeNamesInner;
import org.openapitools.model.PokemonShapeDetailNamesInner;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonShapeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("awesome_names")
  private List<PokemonShapeDetailAwesomeNamesInner> awesomeNames = new ArrayList<>();

  @JsonProperty("names")
  private List<PokemonShapeDetailNamesInner> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return awesomeNames
   */
  public List<PokemonShapeDetailAwesomeNamesInner> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<PokemonShapeDetailAwesomeNamesInner> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  /**
   * 
   * @return names
   */
  public List<PokemonShapeDetailNamesInner> getNames() {
    return names;
  }

  public void setNames(List<PokemonShapeDetailNamesInner> names) {
    this.names = names;
  }

  /**
   * 
   * @return pokemonSpecies
   */
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
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
