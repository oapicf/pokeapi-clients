package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StatDetailAffectingMovesIncreaseInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer change;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon move;
 /**
  * Get change
  * @return change
  */
  @JsonProperty("change")
  @NotNull
  public Integer getChange() {
    return change;
  }

  /**
   * Sets the <code>change</code> property.
   */
 public void setChange(Integer change) {
    this.change = change;
  }

  /**
   * Sets the <code>change</code> property.
   */
  public StatDetailAffectingMovesIncreaseInner change(Integer change) {
    this.change = change;
    return this;
  }

 /**
  * Get move
  * @return move
  */
  @JsonProperty("move")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }

  /**
   * Sets the <code>move</code> property.
   */
 public void setMove(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
  }

  /**
   * Sets the <code>move</code> property.
   */
  public StatDetailAffectingMovesIncreaseInner move(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
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
    StatDetailAffectingMovesIncreaseInner statDetailAffectingMovesIncreaseInner = (StatDetailAffectingMovesIncreaseInner) o;
    return Objects.equals(this.change, statDetailAffectingMovesIncreaseInner.change) &&
        Objects.equals(this.move, statDetailAffectingMovesIncreaseInner.move);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

