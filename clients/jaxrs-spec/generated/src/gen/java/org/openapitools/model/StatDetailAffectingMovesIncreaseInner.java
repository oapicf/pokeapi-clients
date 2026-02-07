package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("StatDetail_affecting_moves_increase_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StatDetailAffectingMovesIncreaseInner   {
  private Integer change;
  private AbilityDetailPokemonInnerPokemon move;

  public StatDetailAffectingMovesIncreaseInner() {
  }

  @JsonCreator
  public StatDetailAffectingMovesIncreaseInner(
    @JsonProperty(required = true, value = "change") Integer change,
    @JsonProperty(required = true, value = "move") AbilityDetailPokemonInnerPokemon move
  ) {
    this.change = change;
    this.move = move;
  }

  /**
   **/
  public StatDetailAffectingMovesIncreaseInner change(Integer change) {
    this.change = change;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "change")
  @NotNull public Integer getChange() {
    return change;
  }

  @JsonProperty(required = true, value = "change")
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
  @JsonProperty(required = true, value = "move")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getMove() {
    return move;
  }

  @JsonProperty(required = true, value = "move")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

