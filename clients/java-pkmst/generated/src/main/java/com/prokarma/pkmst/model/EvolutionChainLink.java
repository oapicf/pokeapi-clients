package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonEvolution;
import com.prokarma.pkmst.model.PokemonSpeciesSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * EvolutionChainLink
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionChainLink   {
  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("evolution_details")
  
  private List<PokemonEvolution> evolutionDetails = new ArrayList<>();

  @JsonProperty("evolves_to")
  
  private List<EvolutionChainLink> evolvesTo = new ArrayList<>();

  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   * @return isBaby
   */
  @ApiModelProperty(required = true, value = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.")
  public Boolean getIsBaby() {
    return isBaby;
  }

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
  @ApiModelProperty(required = true, value = "The Pokémon species at this point in the evolution chain.")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public EvolutionChainLink evolutionDetails(List<PokemonEvolution> evolutionDetails) {
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
  @ApiModelProperty(required = true, value = "All details regarding the specific details of the referenced Pokémon species evolution.")
  public List<PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainLink evolvesTo(List<EvolutionChainLink> evolvesTo) {
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
  @ApiModelProperty(required = true, readOnly = true, value = "A List of chain objects.")
  public List<EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<EvolutionChainLink> evolvesTo) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

