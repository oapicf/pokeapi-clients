package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * EvolutionChainLink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionChainLink {

  private Boolean isBaby;

  private PokemonSpeciesSummary species;

  private List<@Valid PokemonEvolution> evolutionDetails = new ArrayList<>();

  private List<@Valid EvolutionChainLink> evolvesTo = new ArrayList<>();

  public EvolutionChainLink() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainLink(Boolean isBaby, PokemonSpeciesSummary species, List<@Valid PokemonEvolution> evolutionDetails, List<@Valid EvolutionChainLink> evolvesTo) {
    this.isBaby = isBaby;
    this.species = species;
    this.evolutionDetails = evolutionDetails;
    this.evolvesTo = evolvesTo;
  }

  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   * @return isBaby
   */
  @NotNull 
  @Schema(name = "is_baby", description = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  @JsonProperty("is_baby")
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public EvolutionChainLink species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  /**
   * The Pokémon species at this point in the evolution chain.
   * @return species
   */
  @NotNull @Valid 
  @Schema(name = "species", description = "The Pokémon species at this point in the evolution chain.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  @JsonProperty("species")
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public EvolutionChainLink evolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainLink addEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   * @return evolutionDetails
   */
  @NotNull 
  @Schema(name = "evolution_details", description = "All details regarding the specific details of the referenced Pokémon species evolution.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolution_details")
  public List<@Valid PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  @JsonProperty("evolution_details")
  public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainLink evolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  public EvolutionChainLink addEvolvesToItem(EvolutionChainLink evolvesToItem) {
    if (this.evolvesTo == null) {
      this.evolvesTo = new ArrayList<>();
    }
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

  /**
   * A List of chain objects.
   * @return evolvesTo
   */
  
  @Schema(name = "evolves_to", accessMode = Schema.AccessMode.READ_ONLY, description = "A List of chain objects.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolves_to")
  public List<@Valid EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
  }

  @JsonProperty("evolves_to")
  public void setEvolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionChainLink evolutionChainLink = (EvolutionChainLink) o;
    return Objects.equals(this.isBaby, evolutionChainLink.isBaby) &&
        Objects.equals(this.species, evolutionChainLink.species) &&
        Objects.equals(this.evolutionDetails, evolutionChainLink.evolutionDetails) &&
        Objects.equals(this.evolvesTo, evolutionChainLink.evolvesTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBaby, species, evolutionDetails, evolvesTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainLink {\n");
    sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
    sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

