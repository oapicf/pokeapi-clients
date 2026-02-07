package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonColorName;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonColorDetail   {
  
  private Integer id;
  private String name;
  private List<PokemonColorName> names = new ArrayList<>();
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonColorDetail () {

  }

  public PokemonColorDetail (Integer id, String name, List<PokemonColorName> names, List<PokemonSpeciesSummary> pokemonSpecies) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonSpecies = pokemonSpecies;
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

    
  @JsonProperty("names")
  public List<PokemonColorName> getNames() {
    return names;
  }
  public void setNames(List<PokemonColorName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_species")
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
    PokemonColorDetail pokemonColorDetail = (PokemonColorDetail) o;
    return Objects.equals(id, pokemonColorDetail.id) &&
        Objects.equals(name, pokemonColorDetail.name) &&
        Objects.equals(names, pokemonColorDetail.names) &&
        Objects.equals(pokemonSpecies, pokemonColorDetail.pokemonSpecies);
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
