package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.EvolutionChainDetailChainEvolvesToInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionChainDetailChain   {
  
  private List<Object> evolutionDetails = new ArrayList<>();
  private List<EvolutionChainDetailChainEvolvesToInner> evolvesTo = new ArrayList<>();
  private Boolean isBaby;
  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChain () {

  }

  public EvolutionChainDetailChain (List<Object> evolutionDetails, List<EvolutionChainDetailChainEvolvesToInner> evolvesTo, Boolean isBaby, AbilityDetailPokemonInnerPokemon species) {
    this.evolutionDetails = evolutionDetails;
    this.evolvesTo = evolvesTo;
    this.isBaby = isBaby;
    this.species = species;
  }

    
  @JsonProperty("evolution_details")
  public List<Object> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<Object> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

    
  @JsonProperty("evolves_to")
  public List<EvolutionChainDetailChainEvolvesToInner> getEvolvesTo() {
    return evolvesTo;
  }
  public void setEvolvesTo(List<EvolutionChainDetailChainEvolvesToInner> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

    
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

    
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
    return Objects.equals(evolutionDetails, evolutionChainDetailChain.evolutionDetails) &&
        Objects.equals(evolvesTo, evolutionChainDetailChain.evolvesTo) &&
        Objects.equals(isBaby, evolutionChainDetailChain.isBaby) &&
        Objects.equals(species, evolutionChainDetailChain.species);
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
