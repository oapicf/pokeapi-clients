package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.PokemonMoveVersionGroup;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonMove   {
  
  private MoveSummary move;
  private List<PokemonMoveVersionGroup> versionGroupDetails = new ArrayList<>();

  public PokemonMove () {

  }

  public PokemonMove (MoveSummary move, List<PokemonMoveVersionGroup> versionGroupDetails) {
    this.move = move;
    this.versionGroupDetails = versionGroupDetails;
  }

    
  @JsonProperty("move")
  public MoveSummary getMove() {
    return move;
  }
  public void setMove(MoveSummary move) {
    this.move = move;
  }

    
  @JsonProperty("version_group_details")
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
    return Objects.equals(move, pokemonMove.move) &&
        Objects.equals(versionGroupDetails, pokemonMove.versionGroupDetails);
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
