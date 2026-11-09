package apimodels;

import apimodels.PokemonEvolution;
import apimodels.PokemonSpeciesSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * EvolutionChainLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class EvolutionChainLink   {
  @JsonProperty("is_baby")
  @NotNull

  private Boolean isBaby;

  @JsonProperty("species")
  @NotNull
@Valid

  private PokemonSpeciesSummary species;

  @JsonProperty("evolution_details")
  @NotNull
@Valid

  private List<@Valid PokemonEvolution> evolutionDetails = new ArrayList<>();

  @JsonProperty("evolves_to")
  @NotNull
@Valid

  private List<@Valid EvolutionChainLink> evolvesTo = new ArrayList<>();

  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

   /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   * @return isBaby
  **/
  public Boolean getIsBaby() {
    return isBaby;
  }

  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  public EvolutionChainLink species(PokemonSpeciesSummary species) {
    this.species = species;
    return this;
  }

   /**
   * The Pokémon species at this point in the evolution chain.
   * @return species
  **/
  public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  public EvolutionChainLink evolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  public EvolutionChainLink addEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }
    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

   /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   * @return evolutionDetails
  **/
  public List<@Valid PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainLink evolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  public EvolutionChainLink addEvolvesToItem(EvolutionChainLink evolvesToItem) {
    if (this.evolvesTo == null) {
      this.evolvesTo = new ArrayList<>();
    }
    this.evolvesTo.add(evolvesToItem);
    return this;
  }

   /**
   * A List of chain objects.
   * @return evolvesTo
  **/
  public List<@Valid EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
  }

  public void setEvolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

