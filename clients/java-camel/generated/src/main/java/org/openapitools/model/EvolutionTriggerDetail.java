package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionTriggerName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvolutionTriggerDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T01:56:15.309401083Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EvolutionTriggerDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid EvolutionTriggerName> names = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

  public EvolutionTriggerDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionTriggerDetail(Integer id, String name, List<@Valid EvolutionTriggerName> names, List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonSpecies = pokemonSpecies;
  }

  public EvolutionTriggerDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
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
   */
  @Valid 
  @Schema(name = "pokemon_species", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
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
    return Objects.equals(this.id, evolutionTriggerDetail.id) &&
        Objects.equals(this.name, evolutionTriggerDetail.name) &&
        Objects.equals(this.names, evolutionTriggerDetail.names) &&
        Objects.equals(this.pokemonSpecies, evolutionTriggerDetail.pokemonSpecies);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

