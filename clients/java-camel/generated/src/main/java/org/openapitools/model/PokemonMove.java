package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonMoveVersionGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonMove
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonMove {

  private MoveSummary move;

  private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  public PokemonMove() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonMove(MoveSummary move, List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.move = move;
    this.versionGroupDetails = versionGroupDetails;
  }

  public PokemonMove move(MoveSummary move) {
    this.move = move;
    return this;
  }

  /**
   * The move the Pokémon can learn.
   * @return move
   */
  @NotNull @Valid 
  @Schema(name = "move", description = "The move the Pokémon can learn.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move")
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
    this.move = move;
  }

  public PokemonMove versionGroupDetails(List<@Valid PokemonMoveVersionGroup> versionGroupDetails) {
    this.versionGroupDetails = versionGroupDetails;
    return this;
  }

  public PokemonMove addVersionGroupDetailsItem(PokemonMoveVersionGroup versionGroupDetailsItem) {
    if (this.versionGroupDetails == null) {
      this.versionGroupDetails = new ArrayList<>();
    }
    this.versionGroupDetails.add(versionGroupDetailsItem);
    return this;
  }

  /**
   * The details of the version in which the Pokémon can learn the move.
   * @return versionGroupDetails
   */
  @NotNull 
  @Schema(name = "version_group_details", description = "The details of the version in which the Pokémon can learn the move.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group_details")
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

