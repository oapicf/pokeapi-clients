package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonMoveVersionGroup;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonMove  {
  
 /**
  * The move the Pokémon can learn.
  */
  @ApiModelProperty(required = true, value = "The move the Pokémon can learn.")

  @Valid

  private MoveSummary move;

 /**
  * The details of the version in which the Pokémon can learn the move.
  */
  @ApiModelProperty(required = true, value = "The details of the version in which the Pokémon can learn the move.")

  private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();
 /**
   * The move the Pokémon can learn.
   * @return move
  **/
  @JsonProperty("move")
  @NotNull
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
    this.move = move;
  }

  public PokemonMove move(MoveSummary move) {
    this.move = move;
    return this;
  }

 /**
   * The details of the version in which the Pokémon can learn the move.
   * @return versionGroupDetails
  **/
  @JsonProperty("version_group_details")
  @NotNull
  public List<@Valid PokemonMoveVersionGroup> getVersionGroupDetails() {
    return versionGroupDetails;
  }

  public void setVersionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
  }

  public PokemonMove versionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
    return this;
  }

  public PokemonMove addVersionGroupDetailsItem(PokemonMoveVersionGroup versionGroupDetailsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

