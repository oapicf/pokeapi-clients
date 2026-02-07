package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.model.PalParkAreaName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PalParkAreaDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PalParkAreaDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid PalParkAreaName> names = new ArrayList<>();

  @Valid
  private List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  public PalParkAreaDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PalParkAreaDetail(Integer id, String name, List<@Valid PalParkAreaName> names, List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
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

  public PalParkAreaDetail name(String name) {
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PalParkAreaName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PalParkAreaName> names) {
    this.names = names;
  }

  public PalParkAreaDetail pokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  public PalParkAreaDetail addPokemonEncountersItem(PalParkAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }
    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  /**
   * Get pokemonEncounters
   * @return pokemonEncounters
   */
  @NotNull @Valid 
  @Schema(name = "pokemon_encounters", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_encounters")
  public List<@Valid PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  public void setPokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

