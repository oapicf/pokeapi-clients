package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainDetailChainEvolvesToInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();

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
  public List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
 public void setEvolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
  public EvolutionChainDetailChainEvolvesToInner evolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>evolutionDetails</code> list.
   */
  public EvolutionChainDetailChainEvolvesToInner addEvolutionDetailsItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
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
  public EvolutionChainDetailChainEvolvesToInner isBaby(Boolean isBaby) {
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
  public EvolutionChainDetailChainEvolvesToInner species(AbilityDetailPokemonInnerPokemon species) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

