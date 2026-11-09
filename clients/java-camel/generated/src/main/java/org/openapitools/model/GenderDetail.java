package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GenderPokemonSpecies;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GenderDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GenderDetail {

  private Integer id;

  private String name;

  private List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails = new ArrayList<>();

  private List<@Valid PokemonSpeciesSummary> requiredForEvolution = new ArrayList<>();

  public GenderDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenderDetail(Integer id, String name, List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails, List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.id = id;
    this.name = name;
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    this.requiredForEvolution = requiredForEvolution;
  }

  public GenderDetail id(Integer id) {
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

  public GenderDetail name(String name) {
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

  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  public GenderDetail addPokemonSpeciesDetailsItem(GenderPokemonSpecies pokemonSpeciesDetailsItem) {
    if (this.pokemonSpeciesDetails == null) {
      this.pokemonSpeciesDetails = new ArrayList<>();
    }
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

  /**
   * A list of Pokémon species that can be this gender and how likely it is that they will be.
   * @return pokemonSpeciesDetails
   */
  
  @Schema(name = "pokemon_species_details", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon species that can be this gender and how likely it is that they will be.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species_details")
  public List<@Valid GenderPokemonSpecies> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  public void setPokemonSpeciesDetails(List<@Valid GenderPokemonSpecies> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  public GenderDetail requiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  public GenderDetail addRequiredForEvolutionItem(PokemonSpeciesSummary requiredForEvolutionItem) {
    if (this.requiredForEvolution == null) {
      this.requiredForEvolution = new ArrayList<>();
    }
    this.requiredForEvolution.add(requiredForEvolutionItem);
    return this;
  }

  /**
   * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
   * @return requiredForEvolution
   */
  
  @Schema(name = "required_for_evolution", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required_for_evolution")
  public List<@Valid PokemonSpeciesSummary> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  public void setRequiredForEvolution(List<@Valid PokemonSpeciesSummary> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderDetail genderDetail = (GenderDetail) o;
    return Objects.equals(this.id, genderDetail.id) &&
        Objects.equals(this.name, genderDetail.name) &&
        Objects.equals(this.pokemonSpeciesDetails, genderDetail.pokemonSpeciesDetails) &&
        Objects.equals(this.requiredForEvolution, genderDetail.requiredForEvolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pokemonSpeciesDetails, requiredForEvolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pokemonSpeciesDetails: ").append(toIndentedString(pokemonSpeciesDetails)).append("\n");
    sb.append("    requiredForEvolution: ").append(toIndentedString(requiredForEvolution)).append("\n");
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

