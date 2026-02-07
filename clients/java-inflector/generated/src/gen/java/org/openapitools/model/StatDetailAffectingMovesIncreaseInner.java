package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingMovesIncreaseInner   {
  @JsonProperty("change")
  private Integer change;

  @JsonProperty("move")
  private AbilityDetailPokemonInnerPokemon move;

  /**
   **/
  public StatDetailAffectingMovesIncreaseInner change(Integer change) {
    this.change = change;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }
  public void setChange(Integer change) {
    this.change = change;
  }

  /**
   **/
  public StatDetailAffectingMovesIncreaseInner move(AbilityDetailPokemonInnerPokemon move) {
    this.move = move;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

