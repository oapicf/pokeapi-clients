package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.EvolutionTriggerName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionTriggerDetail   {
  
  private Integer id;
  private String name;
  private List<EvolutionTriggerName> names = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

  public EvolutionTriggerDetail () {

  }

  public EvolutionTriggerDetail (Integer id, String name, List<EvolutionTriggerName> names, List<AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
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
  public List<EvolutionTriggerName> getNames() {
    return names;
  }
  public void setNames(List<EvolutionTriggerName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_species")
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
    return Objects.equals(id, evolutionTriggerDetail.id) &&
        Objects.equals(name, evolutionTriggerDetail.name) &&
        Objects.equals(names, evolutionTriggerDetail.names) &&
        Objects.equals(pokemonSpecies, evolutionTriggerDetail.pokemonSpecies);
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
