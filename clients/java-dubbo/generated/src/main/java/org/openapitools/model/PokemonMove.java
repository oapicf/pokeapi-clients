package org.openapitools.model;

import org.openapitools.model.MoveSummary;
import org.openapitools.model.PokemonMoveVersionGroup;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonMove implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The move the Pokémon can learn.
   */
  @JsonProperty("move")
  private MoveSummary move;

  /**
   * The details of the version in which the Pokémon can learn the move.
   */
  @JsonProperty("version_group_details")
  private List<PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  /**
   * The move the Pokémon can learn.
   * @return move
   */
  public MoveSummary getMove() {
    return move;
  }

  public void setMove(MoveSummary move) {
    this.move = move;
  }

  /**
   * The details of the version in which the Pokémon can learn the move.
   * @return versionGroupDetails
   */
  public List<PokemonMoveVersionGroup> getVersionGroupDetails() {
    return versionGroupDetails;
  }

  public void setVersionGroupDetails(List<PokemonMoveVersionGroup> versionGroupDetails) {
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
