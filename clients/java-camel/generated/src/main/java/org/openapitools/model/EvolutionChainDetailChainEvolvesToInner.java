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
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EvolutionChainDetailChainEvolvesToInner
 */

@JsonTypeName("EvolutionChainDetail_chain_evolves_to_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInner {

  @Valid
  private List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();

  private Boolean isBaby;

  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChainEvolvesToInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvolutionChainDetailChainEvolvesToInner(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails, Boolean isBaby, AbilityDetailPokemonInnerPokemon species) {
    this.evolutionDetails = evolutionDetails;
    this.isBaby = isBaby;
    this.species = species;
  }

  public EvolutionChainDetailChainEvolvesToInner evolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainDetailChainEvolvesToInner addEvolutionDetailsItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner evolutionDetailsItem) {
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
  @NotNull @Valid 
  @Schema(name = "evolution_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evolution_details")
  public List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainDetailChainEvolvesToInner isBaby(Boolean isBaby) {
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

  public EvolutionChainDetailChainEvolvesToInner species(AbilityDetailPokemonInnerPokemon species) {
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
    EvolutionChainDetailChainEvolvesToInner evolutionChainDetailChainEvolvesToInner = (EvolutionChainDetailChainEvolvesToInner) o;
    return Objects.equals(this.evolutionDetails, evolutionChainDetailChainEvolvesToInner.evolutionDetails) &&
        Objects.equals(this.isBaby, evolutionChainDetailChainEvolvesToInner.isBaby) &&
        Objects.equals(this.species, evolutionChainDetailChainEvolvesToInner.species);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evolutionDetails, isBaby, species);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionChainDetailChainEvolvesToInner {\n");
    sb.append("    evolutionDetails: ").append(toIndentedString(evolutionDetails)).append("\n");
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

