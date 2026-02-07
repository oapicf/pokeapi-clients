package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetailChain  {
  
  @ApiModelProperty(required = true, value = "")

  private List<Object> evolutionDetails = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private Boolean isBaby;

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon species;
 /**
   * Get evolutionDetails
   * @return evolutionDetails
  **/
  @JsonProperty("evolution_details")
  public List<Object> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainDetailChain evolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainDetailChain addEvolutionDetailsItem(Object evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

 /**
   * Get evolvesTo
   * @return evolvesTo
  **/
  @JsonProperty("evolves_to")
  public List<EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public EvolutionChainDetailChain evolvesTo(List<EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  public EvolutionChainDetailChain addEvolvesToItem(EvolutionChainDetailChainEvolvesToInner evolvesToItem) {
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

 /**
   * Get isBaby
   * @return isBaby
  **/
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public EvolutionChainDetailChain isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
   * Get species
   * @return species
  **/
  @JsonProperty("species")
  public AbilityDetailPokemonInnerPokemon getSpecies() {
    return species;
  }

  public void setSpecies(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
  }

  public EvolutionChainDetailChain species(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

