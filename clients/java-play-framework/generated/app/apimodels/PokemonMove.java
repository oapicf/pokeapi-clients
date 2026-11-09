package apimodels;

import apimodels.MoveSummary;
import apimodels.PokemonMoveVersionGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonMove
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonMove   {
  @JsonProperty("move")
  @NotNull
@Valid

  private MoveSummary move;

  @JsonProperty("version_group_details")
  @NotNull
@Valid

  private List<@Valid PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  public PokemonMove move(MoveSummary move) {
    this.move = move;
    return this;
  }

   /**
   * The move the Pokémon can learn.
   * @return move
  **/
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
  **/
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
    return Objects.equals(move, pokemonMove.move) &&
        Objects.equals(versionGroupDetails, pokemonMove.versionGroupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(move, versionGroupDetails);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

