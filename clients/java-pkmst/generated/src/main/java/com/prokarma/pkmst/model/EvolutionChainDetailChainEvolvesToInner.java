package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;
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
 * EvolutionChainDetailChainEvolvesToInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInner   {
  @JsonProperty("evolution_details")
  
  private List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();

  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("species")
  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChainEvolvesToInner evolutionDetails(List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
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
  @ApiModelProperty(required = true, value = "")
  public List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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

