package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PokemonEvolution;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvolutionChainLink   {
  
  private Boolean isBaby;
  private PokemonSpeciesSummary species;
  private List<PokemonEvolution> evolutionDetails = new ArrayList<>();
  private List<EvolutionChainLink> evolvesTo = new ArrayList<>();

  public EvolutionChainLink () {

  }

  public EvolutionChainLink (Boolean isBaby, PokemonSpeciesSummary species, List<PokemonEvolution> evolutionDetails, List<EvolutionChainLink> evolvesTo) {
    this.isBaby = isBaby;
    this.species = species;
    this.evolutionDetails = evolutionDetails;
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
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

    
  @JsonProperty("evolution_details")
  public List<PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

    
  @JsonProperty("evolves_to")
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
    return Objects.equals(isBaby, evolutionChainLink.isBaby) &&
        Objects.equals(species, evolutionChainLink.species) &&
        Objects.equals(evolutionDetails, evolutionChainLink.evolutionDetails) &&
        Objects.equals(evolvesTo, evolutionChainLink.evolvesTo);
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
