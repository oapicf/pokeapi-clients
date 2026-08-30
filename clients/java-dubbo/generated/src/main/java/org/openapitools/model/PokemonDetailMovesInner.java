package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokemonDetailMovesInnerVersionGroupDetailsInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonDetailMovesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("move")
  private AbilityDetailPokemonInnerPokemon move;

  @JsonProperty("version_group_details")
  private List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails = new ArrayList<>();

  /**
   * 
   * @return move
   */
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }

  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

  /**
   * 
   * @return versionGroupDetails
   */
  public List<PokemonDetailMovesInnerVersionGroupDetailsInner> getVersionGroupDetails() {
    return versionGroupDetails;
  }

  public void setVersionGroupDetails(List<PokemonDetailMovesInnerVersionGroupDetailsInner> versionGroupDetails) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
