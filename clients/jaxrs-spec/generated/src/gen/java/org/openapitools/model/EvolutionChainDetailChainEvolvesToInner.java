package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("EvolutionChainDetail_chain_evolves_to_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInner   {
  private @Valid List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();
  private Boolean isBaby;
  private AbilityDetailPokemonInnerPokemon species;

  public EvolutionChainDetailChainEvolvesToInner() {
  }

  @JsonCreator
  public EvolutionChainDetailChainEvolvesToInner(
    @JsonProperty(required = true, value = "evolution_details") List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails,
    @JsonProperty(required = true, value = "is_baby") Boolean isBaby,
    @JsonProperty(required = true, value = "species") AbilityDetailPokemonInnerPokemon species
  ) {
    this.evolutionDetails = evolutionDetails;
    this.isBaby = isBaby;
    this.species = species;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInner evolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "evolution_details")
  @NotNull @Valid public List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }

  @JsonProperty(required = true, value = "evolution_details")
  public void setEvolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  public EvolutionChainDetailChainEvolvesToInner addEvolutionDetailsItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner evolutionDetailsItem) {
    if (this.evolutionDetails == null) {
      this.evolutionDetails = new ArrayList<>();
    }

    this.evolutionDetails.add(evolutionDetailsItem);
    return this;
  }

  public EvolutionChainDetailChainEvolvesToInner removeEvolutionDetailsItem(EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner evolutionDetailsItem) {
    if (evolutionDetailsItem != null && this.evolutionDetails != null) {
      this.evolutionDetails.remove(evolutionDetailsItem);
    }

    return this;
  }
  /**
   **/
  public EvolutionChainDetailChainEvolvesToInner isBaby(Boolean isBaby) {
    this.isBaby = isBaby;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "is_baby")
  @NotNull public Boolean getIsBaby() {
    return isBaby;
  }

  @JsonProperty(required = true, value = "is_baby")
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   **/
  public EvolutionChainDetailChainEvolvesToInner species(AbilityDetailPokemonInnerPokemon species) {
    this.species = species;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "species")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getSpecies() {
    return species;
  }

  @JsonProperty(required = true, value = "species")
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
    return Objects.equals(this.evolutionDetails, evolutionChainDetailChainEvolvesToInner.evolutionDetails) &&
        Objects.equals(this.isBaby, evolutionChainDetailChainEvolvesToInner.isBaby) &&
        Objects.equals(this.species, evolutionChainDetailChainEvolvesToInner.species);
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

