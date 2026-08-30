package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.AnyType;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class EvolutionChainDetailChain implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("evolution_details")
  private List<AnyType> evolutionDetails = new ArrayList<>();

  @JsonProperty("evolves_to")
  private List<EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();

  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("species")
  private AbilityDetailPokemonInnerPokemon species;

  /**
   * 
   * @return evolutionDetails
   */
  public List<AnyType> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<AnyType> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * 
   * @return evolvesTo
   */
  public List<EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  /**
   * 
   * @return isBaby
   */
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * 
   * @return species
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
