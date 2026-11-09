package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

 /**
  * The Pokémon species at this point in the evolution chain.
  * @return species
  */
  @JsonProperty("species")
  @NotNull
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  /**
   * Sets the <code>species</code> property.
   */
 public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * Sets the <code>species</code> property.
   */
  public EvolutionChainLink species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

 /**
  * All details regarding the specific details of the referenced Pokémon species evolution.
  * @return evolutionDetails
  */
  @JsonProperty("evolution_details")
  @NotNull
  public List<@Valid PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
 public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * Sets the <code>evolutionDetails</code> property.
   */
  public EvolutionChainLink evolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  /**
   * Adds a new item to the <code>evolutionDetails</code> list.
   */
  public EvolutionChainLink addEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

 /**
  * A List of chain objects.
  * @return evolvesTo
  */
  @JsonProperty("evolves_to")
  @NotNull
  public List<@Valid EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
  }

  /**
   * Sets the <code>evolvesTo</code> property.
   * <br><em>N.B. <code>evolvesTo</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEvolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  /**
   * Sets the <code>evolvesTo</code> property.
   * <br><em>N.B. <code>evolvesTo</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public EvolutionChainLink evolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  /**
   * Adds a new item to the <code>evolvesTo</code> list.
   * <br><em>N.B. <code>evolvesTo</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public EvolutionChainLink addEvolvesToItem(EvolutionChainLink evolvesToItem) {
    this.evolvesTo.add(evolvesToItem);
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

