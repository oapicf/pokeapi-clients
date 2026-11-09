package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonMove")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMove   {
  private MoveSummary move;
  private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  public PokemonMove() {
  }

  @JsonCreator
  public PokemonMove(
    @JsonProperty(required = true, value = "move") MoveSummary move,
    @JsonProperty(required = true, value = "version_group_details") List<@Valid PokemonMoveVersionGroup> versionGroupDetails
  ) {
    this.move = move;
    this.versionGroupDetails = versionGroupDetails;
  }

  /**
   * The move the Pokémon can learn.
   **/
  public PokemonMove move(MoveSummary move) {
    this.move = move;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The move the Pokémon can learn.")
  @JsonProperty(required = true, value = "move")
  @NotNull @Valid public MoveSummary getMove() {
    return move;
  }

  @JsonProperty(required = true, value = "move")
  public void setMove(MoveSummary move) {
    this.move = move;
  }

  /**
   * The details of the version in which the Pokémon can learn the move.
   **/
  public PokemonMove versionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The details of the version in which the Pokémon can learn the move.")
  @JsonProperty(required = true, value = "version_group_details")
  @NotNull public List<@Valid PokemonMoveVersionGroup> getVersionGroupDetails() {
    return versionGroupDetails;
  }

  @JsonProperty(required = true, value = "version_group_details")
  public void setVersionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
  }

  public PokemonMove addVersionGroupDetailsItem(PokemonMoveVersionGroup versionGroupDetailsItem) {
    if (this.versionGroupDetails == null) {
      this.versionGroupDetails = new ArrayList<>();
    }

    this.versionGroupDetails.add(versionGroupDetailsItem);
    return this;
  }

  public PokemonMove removeVersionGroupDetailsItem(PokemonMoveVersionGroup versionGroupDetailsItem) {
    if (versionGroupDetailsItem != null && this.versionGroupDetails != null) {
      this.versionGroupDetails.remove(versionGroupDetailsItem);
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
