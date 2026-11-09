package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonMoveVersionGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMove   {
  
  private MoveSummary move;
  private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  /**
   * The move the Pokémon can learn.
   **/
  
  @ApiModelProperty(required = true, value = "The move the Pokémon can learn.")
  @JsonProperty("move")
  @NotNull
  public MoveSummary getMove() {
    return move;
  }
  public void setMove(MoveSummary move) {
    this.move = move;
  }

  /**
   * The details of the version in which the Pokémon can learn the move.
   **/
  
  @ApiModelProperty(required = true, value = "The details of the version in which the Pokémon can learn the move.")
  @JsonProperty("version_group_details")
  @NotNull
  public List<@Valid PokemonMoveVersionGroup> getVersionGroupDetails() {
    return versionGroupDetails;
  }
  public void setVersionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
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
    PokemonMove pokemonMove = (PokemonMove) o;
    return Objects.equals(this.move, pokemonMove.move) &&
        Objects.equals(this.versionGroupDetails, pokemonMove.versionGroupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(move, versionGroupDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonMove {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

