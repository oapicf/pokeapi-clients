package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetailChain  {
  
  @ApiModelProperty(required = true, value = "")
  private List<Object> evolutionDetails = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  private Boolean isBaby;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon species;
 /**
  * Get evolutionDetails
  * @return evolutionDetails
  */
  @JsonProperty("evolution_details")
  @NotNull
  public List<Object> getEvolutionDetails() {
    return evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
 public void setEvolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
  public EvolutionChainDetailChain evolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>evolutionDetails</code> list.
   */
  public EvolutionChainDetailChain addEvolutionDetailsItem(Object evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

 /**
  * Get evolvesTo
  * @return evolvesTo
  */
  @JsonProperty("evolves_to")
  @NotNull
  public List<@Valid EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }

  /**
   * Sets the <code>evolvesTo</code> property.
   */
 public void setEvolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  /**
   * Sets the <code>evolvesTo</code> property.
   */
  public EvolutionChainDetailChain evolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  /**
   * Adds a new item to the <code>evolvesTo</code> list.
   */
  public EvolutionChainDetailChain addEvolvesToItem(EvolutionChainDetailChainEvolvesToInner evolvesToItem) {
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

 /**
  * Get isBaby
  * @return isBaby
  */
  @JsonProperty("is_baby")
  @NotNull
  public Boolean getIsBaby() {
    return isBaby;
  }

  /**
   * Sets the <code>isBaby</code> property.
   */
 public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * Sets the <code>isBaby</code> property.
   */
  public EvolutionChainDetailChain isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
  * Get species
  * @return species
  */
  @JsonProperty("species")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getSpecies() {
    return species;
  }

  /**
   * Sets the <code>species</code> property.
   */
 public void setSpecies(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
  }

  /**
   * Sets the <code>species</code> property.
   */
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

