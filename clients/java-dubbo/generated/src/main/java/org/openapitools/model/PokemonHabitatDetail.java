package org.openapitools.model;

import org.openapitools.model.PokemonHabitatName;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonHabitatDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<PokemonHabitatName> names = new ArrayList<>();

  /**
   * A list of the Pokémon species that can be found in this habitat.
   */
  @JsonProperty("pokemon_species")
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<PokemonHabitatName> getNames() {
    return names;
  }

  public void setNames(List<PokemonHabitatName> names) {
    this.names = names;
  }

  /**
   * A list of the Pokémon species that can be found in this habitat.
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
