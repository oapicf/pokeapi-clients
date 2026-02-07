package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenderDetailPokemonSpeciesDetailsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GenderDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class GenderDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution = new ArrayList<>();

  public GenderDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenderDetail(Integer id, String name, List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails, List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
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

  public GenderDetail name(String name) {
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

  public GenderDetail pokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
    return this;
  }

  public GenderDetail addPokemonSpeciesDetailsItem(GenderDetailPokemonSpeciesDetailsInner pokemonSpeciesDetailsItem) {
    if (this.pokemonSpeciesDetails == null) {
      this.pokemonSpeciesDetails = new ArrayList<>();
    }
    this.pokemonSpeciesDetails.add(pokemonSpeciesDetailsItem);
    return this;
  }

  /**
   * Get pokemonSpeciesDetails
   * @return pokemonSpeciesDetails
   */
  @NotNull @Valid 
  @Schema(name = "pokemon_species_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species_details")
  public List<@Valid GenderDetailPokemonSpeciesDetailsInner> getPokemonSpeciesDetails() {
    return pokemonSpeciesDetails;
  }

  public void setPokemonSpeciesDetails(List<@Valid GenderDetailPokemonSpeciesDetailsInner> pokemonSpeciesDetails) {
    this.pokemonSpeciesDetails = pokemonSpeciesDetails;
  }

  public GenderDetail requiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
    this.requiredForEvolution = requiredForEvolution;
    return this;
  }

  public GenderDetail addRequiredForEvolutionItem(AbilityDetailPokemonInnerPokemon requiredForEvolutionItem) {
    if (this.requiredForEvolution == null) {
      this.requiredForEvolution = new ArrayList<>();
    }
    this.requiredForEvolution.add(requiredForEvolutionItem);
    return this;
  }

  /**
   * Get requiredForEvolution
   * @return requiredForEvolution
   */
  @NotNull @Valid 
  @Schema(name = "required_for_evolution", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required_for_evolution")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getRequiredForEvolution() {
    return requiredForEvolution;
  }

  public void setRequiredForEvolution(List<@Valid AbilityDetailPokemonInnerPokemon> requiredForEvolution) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

