package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionChainLink   {
  @JsonProperty("is_baby")
  private Boolean isBaby;

  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  @JsonProperty("evolution_details")
  private List<PokemonEvolution> evolutionDetails = new ArrayList<>();

  @JsonProperty("evolves_to")
  private List<EvolutionChainLink> evolvesTo = new ArrayList<>();

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   **/
  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.")
  @JsonProperty("is_baby")
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * The Pokémon species at this point in the evolution chain.
   **/
  public EvolutionChainLink species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon species at this point in the evolution chain.")
  @JsonProperty("species")
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   **/
  public EvolutionChainLink evolutionDetails(List<PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "All details regarding the specific details of the referenced Pokémon species evolution.")
  @JsonProperty("evolution_details")
  public List<PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * A List of chain objects.
   **/
  public EvolutionChainLink evolvesTo(List<EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A List of chain objects.")
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

