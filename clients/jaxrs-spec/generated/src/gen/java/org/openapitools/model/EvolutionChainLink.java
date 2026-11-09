package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokemonEvolution;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EvolutionChainLink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class EvolutionChainLink   {
  private Boolean isBaby;
  private PokemonSpeciesSummary species;
  private List<@Valid PokemonEvolution> evolutionDetails = new ArrayList<>();
  private List<@Valid EvolutionChainLink> evolvesTo = new ArrayList<>();

  public EvolutionChainLink() {
  }

  @JsonCreator
  public EvolutionChainLink(
    @JsonProperty(required = true, value = "is_baby") Boolean isBaby,
    @JsonProperty(required = true, value = "species") PokemonSpeciesSummary species,
    @JsonProperty(required = true, value = "evolution_details") List<@Valid PokemonEvolution> evolutionDetails,
    @JsonProperty(required = true, value = "evolves_to") List<@Valid EvolutionChainLink> evolvesTo
  ) {
    this.isBaby = isBaby;
    this.species = species;
    this.evolutionDetails = evolutionDetails;
    this.evolvesTo = evolvesTo;
  }

  /**
   * Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
   **/
  public EvolutionChainLink isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.")
  @JsonProperty(required = true, value = "is_baby")
  @NotNull public Boolean getIsBaby() {
    return isBaby;
  }

  @JsonProperty(required = true, value = "is_baby")
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
  @JsonProperty(required = true, value = "species")
  @NotNull @Valid public PokemonSpeciesSummary getSpecies() {
    return species;
  }

  @JsonProperty(required = true, value = "species")
  public void setSpecies(PokemonSpeciesSummary species) {
    this.species = species;
  }

  /**
   * All details regarding the specific details of the referenced Pokémon species evolution.
   **/
  public EvolutionChainLink evolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "All details regarding the specific details of the referenced Pokémon species evolution.")
  @JsonProperty(required = true, value = "evolution_details")
  @NotNull public List<@Valid PokemonEvolution> getEvolutionDetails() {
    return evolutionDetails;
  }

  @JsonProperty(required = true, value = "evolution_details")
  public void setEvolutionDetails(List<@Valid PokemonEvolution> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainLink addEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }

    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

  public EvolutionChainLink removeEvolutionDetailsItem(PokemonEvolution evolutionDetailsItem) {
    if (evolutionDetailsItem != null && this.evolutionDetails != null) {
      this.evolutionDetails.remove(evolutionDetailsItem);
    }

    return this;
  }
  /**
   * A List of chain objects.
   **/
  public EvolutionChainLink evolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A List of chain objects.")
  @JsonProperty(required = true, value = "evolves_to")
  public List<@Valid EvolutionChainLink> getEvolvesTo() {
    return evolvesTo;
  }

  @JsonProperty(required = true, value = "evolves_to")
  public void setEvolvesTo(List<@Valid EvolutionChainLink> evolvesTo) {
    this.evolvesTo = evolvesTo;
  }

  public EvolutionChainLink addEvolvesToItem(EvolutionChainLink evolvesToItem) {
    if (this.evolvesTo == null) {
      this.evolvesTo = new ArrayList<>();
    }

    this.evolvesTo.add(evolvesToItem);
    return this;
  }

  public EvolutionChainLink removeEvolvesToItem(EvolutionChainLink evolvesToItem) {
    if (evolvesToItem != null && this.evolvesTo != null) {
      this.evolvesTo.remove(evolvesToItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
