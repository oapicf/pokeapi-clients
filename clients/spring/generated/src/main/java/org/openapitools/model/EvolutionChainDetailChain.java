package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvolutionChainDetailChain
 */

@JsonTypeName("EvolutionChainDetail_chain")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChain {

  @Valid
  private List<Object> evolutionDetails = new ArrayList<>();

  @Valid
  private List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  private Boolean isBaby;

  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChain() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainDetailChain(List<Object> evolutionDetails, List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo, Boolean isBaby, AbilityDetailPokemonInnerPokemon species) {
    this.evolutionDetails = evolutionDetails;
    this.evolvesTo = evolvesTo;
    this.isBaby = isBaby;
    this.species = species;
  }

  public EvolutionChainDetailChain evolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainDetailChain addEvolutionDetailsItem(Object evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

  /**
   * Get evolutionDetails
   * @return evolutionDetails
   */
  @NotNull 
  @Schema(name = "evolution_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolution_details")
  public List<Object> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainDetailChain evolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  public EvolutionChainDetailChain addEvolvesToItem(EvolutionChainDetailChainEvolvesToInner evolvesToItem) {
    if (this.evolvesTo == null) {
      this.evolvesTo = new ArrayList<>();
    }
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

  /**
   * Get evolvesTo
   * @return evolvesTo
   */
  @NotNull @Valid 
  @Schema(name = "evolves_to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolves_to")
  public List<@Valid EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public EvolutionChainDetailChain isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  /**
   * Get isBaby
   * @return isBaby
   */
  @NotNull 
  @Schema(name = "is_baby", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public EvolutionChainDetailChain species(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
    return this;
  }

  /**
   * Get species
   * @return species
   */
  @NotNull @Valid 
  @Schema(name = "species", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("species")
  public AbilityDetailPokemonInnerPokemon getSpecies() {
    return species;
  }

  public void setSpecies(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionChainDetailChain evolutionChainDetailChain = (EvolutionChainDetailChain) o;
    return Objects.equals(this.evolutionDetails, evolutionChainDetailChain.evolutionDetails) &&
        Objects.equals(this.evolvesTo, evolutionChainDetailChain.evolvesTo) &&
        Objects.equals(this.isBaby, evolutionChainDetailChain.isBaby) &&
        Objects.equals(this.species, evolutionChainDetailChain.species);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evolutionDetails, evolvesTo, isBaby, species);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetailChain {\n");
    sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
    sb.append("    evolvesTo: ").append(toIndentedString(evolvesTo)).append("\n");
    sb.append("    isBaby: ").append(toIndentedString(isBaby)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
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

