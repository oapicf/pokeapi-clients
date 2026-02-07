package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatDetailAffectingMovesIncreaseInner   {
  
  private Integer change;
  private AbilityDetailPokemonInnerPokemon move;

  public StatDetailAffectingMovesIncreaseInner () {

  }

  public StatDetailAffectingMovesIncreaseInner (Integer change, AbilityDetailPokemonInnerPokemon move) {
    this.change = change;
    this.move = move;
  }

    
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

    
  @JsonProperty("move")
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }
  public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatDetailAffectingMovesIncreaseInner statDetailAffectingMovesIncreaseInner = (StatDetailAffectingMovesIncreaseInner) o;
    return Objects.equals(change, statDetailAffectingMovesIncreaseInner.change) &&
        Objects.equals(move, statDetailAffectingMovesIncreaseInner.move);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, move);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatDetailAffectingMovesIncreaseInner {\n");
    
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    move: ").append(toIndentedString(move)).append("\n");
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
