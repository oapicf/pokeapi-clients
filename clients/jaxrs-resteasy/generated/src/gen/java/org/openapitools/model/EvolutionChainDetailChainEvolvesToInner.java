package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionChainDetailChainEvolvesToInner   {
  
  private List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails = new ArrayList<>();
  private Boolean isBaby;
  private AbilityDetailPokemonInnerPokemon species;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("evolution_details")
  @NotNull
  @Valid
  public List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> getEvolutionDetails() {
    return evolutionDetails;
  }
  public void setEvolutionDetails(List<@Valid EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner> evolutionDetails) {
    this.evolutionDetails = evolutionDetails;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("is_baby")
  @NotNull
  public Boolean getIsBaby() {
    return isBaby;
  }
  public void setIsBaby(Boolean isBaby) {
    this.isBaby = isBaby;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("species")
  @NotNull
  @Valid
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

