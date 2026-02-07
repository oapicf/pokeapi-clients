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
import org.openapitools.model.PokemonDetailMovesInnerVersionGroupDetailsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokemonDetailMovesInner   {
  
  private AbilityDetailPokemonInnerPokemon move;
  private List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("move")
  @NotNull
  @Valid
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }
  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group_details")
  @NotNull
  @Valid
  public List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
    return versionGroupDetails;
  }
  public void setVersionGroupDetails(List<@Valid PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
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

