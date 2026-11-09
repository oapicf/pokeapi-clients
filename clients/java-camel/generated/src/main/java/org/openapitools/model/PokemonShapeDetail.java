package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonShapeAwesomeName;
import org.openapitools.model.PokemonShapeName;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonShapeDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonShapeDetail {

  private Integer id;

  private String name;

  private List<@Valid PokemonShapeAwesomeName> awesomeNames = new ArrayList<>();

  private List<@Valid PokemonShapeName> names = new ArrayList<>();

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public PokemonShapeDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonShapeDetail(Integer id, String name, List<@Valid PokemonShapeAwesomeName> awesomeNames, List<@Valid PokemonShapeName> names, List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.id = id;
    this.name = name;
    this.awesomeNames = awesomeNames;
    this.names = names;
    this.pokemonSpecies = pokemonSpecies;
  }

  public PokemonShapeDetail id(Integer id) {
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

  public PokemonShapeDetail name(String name) {
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

  public PokemonShapeDetail awesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
    return this;
  }

  public PokemonShapeDetail addAwesomeNamesItem(PokemonShapeAwesomeName awesomeNamesItem) {
    if (this.awesomeNames == null) {
      this.awesomeNames = new ArrayList<>();
    }
    this.awesomeNames.add(awesomeNamesItem);
    return this;
  }

  /**
   * The \"scientific\" name of this Pokémon shape listed in different languages.
   * @return awesomeNames
   */
  
  @Schema(name = "awesome_names", accessMode = Schema.AccessMode.READ_ONLY, description = "The \"scientific\" name of this Pokémon shape listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("awesome_names")
  public List<@Valid PokemonShapeAwesomeName> getAwesomeNames() {
    return awesomeNames;
  }

  public void setAwesomeNames(List<@Valid PokemonShapeAwesomeName> awesomeNames) {
    this.awesomeNames = awesomeNames;
  }

  public PokemonShapeDetail names(List<@Valid PokemonShapeName> names) {
    this.names = names;
    return this;
  }

  public PokemonShapeDetail addNamesItem(PokemonShapeName namesItem) {
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
  public List<@Valid PokemonShapeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonShapeName> names) {
    this.names = names;
  }

  public PokemonShapeDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public PokemonShapeDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  /**
   * A list of the Pokémon species that have this shape.
   * @return pokemonSpecies
   */
  
  @Schema(name = "pokemon_species", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of the Pokémon species that have this shape.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
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

