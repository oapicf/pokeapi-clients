package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class EvolutionChainDetailChain   {
  
  private List<Object> evolutionDetails = new ArrayList<>();

  private List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  private Boolean isBaby;

  private AbilityDetailPokemonInnerPokemon species;

  /**
   **/
  public EvolutionChainDetailChain evolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolution_details")
  @NotNull
  public List<Object> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainDetailChain addEvolutionDetailsItem(Object evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }


  /**
   **/
  public EvolutionChainDetailChain evolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolves_to")
  @NotNull
  public List<@Valid EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }
  public void setEvolvesTo(List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public EvolutionChainDetailChain addEvolvesToItem(EvolutionChainDetailChainEvolvesToInner evolvesToItem) {
    if (this.evolvesTo == null) {
      this.evolvesTo = new ArrayList<>();
    }
    this.evolvesTo.add(evolvesToItem);
    return this;
  }


  /**
   **/
  public EvolutionChainDetailChain isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("is_baby")
  @NotNull
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }


  /**
   **/
  public EvolutionChainDetailChain species(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("species")
  @NotNull
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

