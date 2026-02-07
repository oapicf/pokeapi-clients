package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.EvolutionTriggerName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EvolutionTriggerDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionTriggerDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid EvolutionTriggerName> names = new ArrayList<>();

  @JsonProperty("pokemon_species")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

  public EvolutionTriggerDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
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
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionTriggerDetail names(List<@Valid EvolutionTriggerName> names) {
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
  **/
  public List<@Valid EvolutionTriggerName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EvolutionTriggerName> names) {
    this.names = names;
  }

  public EvolutionTriggerDetail pokemonSpecies(List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
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
  **/
  public List<@Valid AbilityDetailPokemonInnerPokemon> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

