package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailMovesInnerVersionGroupDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonDetailMovesInner   {
  
  private AbilityDetailPokemonInnerPokemon move;

  private List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

  /**
   **/
  public PokemonDetailMovesInner move(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }
  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }


  /**
   **/
  public PokemonDetailMovesInner versionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group_details")
  @NotNull
  public List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
    return versionGroupDetails;
  }
  public void setVersionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
  }

  public PokemonDetailMovesInner addVersionGroupDetailsItem(PokemonDetailMovesInnerVersionGroupDetailsInner versionGroupDetailsItem) {
    if (this.versionGroupDetails == null) {
      this.versionGroupDetails = new ArrayList<>();
    }
    this.versionGroupDetails.add(versionGroupDetailsItem);
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
    PokemonDetailMovesInner pokemonDetailMovesInner = (PokemonDetailMovesInner) o;
    return Objects.equals(this.move, pokemonDetailMovesInner.move) &&
        Objects.equals(this.versionGroupDetails, pokemonDetailMovesInner.versionGroupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(move, versionGroupDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDetailMovesInner {\n");
    
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
    sb.append("    versionGroupDetails: ").append(toIndentedString(versionGroupDetails)).append("\n");
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

