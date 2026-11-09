package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PalParkAreaName;
import org.openapitools.model.PalParkEncounter;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PalParkAreaDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PalParkAreaDetail {

  private Integer id;

  private String name;

  private List<@Valid PalParkAreaName> names = new ArrayList<>();

  private List<@Valid PalParkEncounter> pokemonEncounters = new ArrayList<>();

  public PalParkAreaDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PalParkAreaDetail(Integer id, String name, List<@Valid PalParkAreaName> names, List<@Valid PalParkEncounter> pokemonEncounters) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
  }

  public PalParkAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PalParkAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PalParkAreaDetail names(List<@Valid PalParkAreaName> names) {
    this.names = names;
    return this;
  }

  public PalParkAreaDetail addNamesItem(PalParkAreaName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PalParkAreaName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PalParkAreaName> names) {
    this.names = names;
  }

  public PalParkAreaDetail pokemonEncounters(List<@Valid PalParkEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  public PalParkAreaDetail addPokemonEncountersItem(PalParkEncounter pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }
    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  /**
   * A list of Pokémon encountered in thi pal park area along with details.
   * @return pokemonEncounters
   */
  
  @Schema(name = "pokemon_encounters", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon encountered in thi pal park area along with details.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_encounters")
  public List<@Valid PalParkEncounter> getPokemonEncounters() {
    return pokemonEncounters;
  }

  public void setPokemonEncounters(List<@Valid PalParkEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalParkAreaDetail palParkAreaDetail = (PalParkAreaDetail) o;
    return Objects.equals(this.id, palParkAreaDetail.id) &&
        Objects.equals(this.name, palParkAreaDetail.name) &&
        Objects.equals(this.names, palParkAreaDetail.names) &&
        Objects.equals(this.pokemonEncounters, palParkAreaDetail.pokemonEncounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonEncounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkAreaDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
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

