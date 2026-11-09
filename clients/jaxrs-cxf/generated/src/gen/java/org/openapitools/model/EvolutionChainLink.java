package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionChainLink  {
  
 /**
  * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
  */
  @ApiModelProperty(required = true, value = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.")

  private Boolean isBaby;

 /**
  * The Pokémon species at this point in the evolution chain.
  */
  @ApiModelProperty(required = true, value = "The Pokémon species at this point in the evolution chain.")

  @Valid

  private PokemonSpeciesSummary species;

 /**
  * All details regarding the specific details of the referenced Pokémon species evolution.
  */
  @ApiModelProperty(required = true, value = "All details regarding the specific details of the referenced Pokémon species evolution.")

  private List<@Valid PokemonEvolution> evolutionDetails = new ArrayList<>();

 /**
  * A List of chain objects.
  */
  @ApiModelProperty(required = true, value = "A List of chain objects.")

  private List<@Valid EvolutionChainLink> evolvesTo = new ArrayList<>();
 /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   * @return isBaby
  **/
  @JsonProperty("is_baby")
  @NotNull
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
   * The Pokémon species at this point in the evolution chain.
   * @return species
  **/
  @JsonProperty("species")
  @NotNull
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public EvolutionChainLink species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

 /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   * @return evolutionDetails
  **/
  @JsonProperty("evolution_details")
  @NotNull
  public List<@Valid PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainLink evolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainLink addEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

 /**
   * A List of chain objects.
   * @return evolvesTo
  **/
  @JsonProperty("evolves_to")
  @NotNull
  public List<@Valid EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
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
    return Objects.equals(this.isBaby, evolutionChainLink.isBaby) &&
        Objects.equals(this.species, evolutionChainLink.species) &&
        Objects.equals(this.evolutionDetails, evolutionChainLink.evolutionDetails) &&
        Objects.equals(this.evolvesTo, evolutionChainLink.evolvesTo);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

