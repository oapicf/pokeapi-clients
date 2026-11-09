package org.openapitools.model;

import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class EvolutionChainLink implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   */
  @JsonProperty("is_baby")
  private Boolean isBaby;

  /**
   * The Pokémon species at this point in the evolution chain.
   */
  @JsonProperty("species")
  private PokemonSpeciesSummary species;

  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   */
  @JsonProperty("evolution_details")
  private List<PokemonEvolution> evolutionDetails = new ArrayList<>();

  /**
   * A List of chain objects.
   */
  @JsonProperty("evolves_to")
  private List<EvolutionChainLink> evolvesTo = new ArrayList<>();

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   * @return isBaby
   */
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   * The Pokémon species at this point in the evolution chain.
   * @return species
   */
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   * @return evolutionDetails
   */
  public List<PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   * A List of chain objects.
   * @return evolvesTo
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
