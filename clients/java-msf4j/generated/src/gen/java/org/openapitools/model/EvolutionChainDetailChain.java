package org.openapitools.model;

import java.util.Objects;
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

/**
 * EvolutionChainDetailChain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T15:23:10.683633502Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChain   {
  @JsonProperty("evolution_details")
  private List<Object> evolutionDetails = new ArrayList<>();

  @JsonProperty("evolves_to")
  private List<@Valid EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("species")
  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChain evolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainDetailChain addEvolutionDetailsItem(Object evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

   /**
   * Get evolutionDetails
   * @return evolutionDetails
  **/
  @ApiModelProperty(required = true, value = "")
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
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

   /**
   * Get evolvesTo
   * @return evolvesTo
  **/
  @ApiModelProperty(required = true, value = "")
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
  **/
  @ApiModelProperty(required = true, value = "")
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
  **/
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

