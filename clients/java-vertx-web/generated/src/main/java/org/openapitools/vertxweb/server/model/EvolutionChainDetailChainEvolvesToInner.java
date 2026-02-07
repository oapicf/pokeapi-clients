package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionChainDetailChainEvolvesToInner   {
  
  private List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();
  private Boolean isBaby;
  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChainEvolvesToInner () {

  }

  public EvolutionChainDetailChainEvolvesToInner (List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails, Boolean isBaby, AbilityDetailPokemonInnerPokemon species) {
    this.evolutionDetails = evolutionDetails;
    this.isBaby = isBaby;
    this.species = species;
  }

    
  @JsonProperty("evolution_details")
  public List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
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
    EvolutionChainDetailChainEvolvesToInner evolutionChainDetailChainEvolvesToInner = (EvolutionChainDetailChainEvolvesToInner) o;
    return Objects.equals(evolutionDetails, evolutionChainDetailChainEvolvesToInner.evolutionDetails) &&
        Objects.equals(isBaby, evolutionChainDetailChainEvolvesToInner.isBaby) &&
        Objects.equals(species, evolutionChainDetailChainEvolvesToInner.species);
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
