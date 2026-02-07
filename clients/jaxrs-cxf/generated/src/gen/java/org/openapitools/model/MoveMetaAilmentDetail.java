package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaAilmentName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMetaAilmentDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid MoveMetaAilmentName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveMetaAilmentDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get moves
   * @return moves
  **/
  @JsonProperty("moves")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }

  public MoveMetaAilmentDetail moves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
    return this;
  }

  public MoveMetaAilmentDetail addMovesItem(AbilityDetailPokemonInnerPokemon movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveMetaAilmentName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
  }

  public MoveMetaAilmentDetail names(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
    return this;
  }

  public MoveMetaAilmentDetail addNamesItem(MoveMetaAilmentName namesItem) {
    this.names.add(namesItem);
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
    MoveMetaAilmentDetail moveMetaAilmentDetail = (MoveMetaAilmentDetail) o;
    return Objects.equals(this.id, moveMetaAilmentDetail.id) &&
        Objects.equals(this.name, moveMetaAilmentDetail.name) &&
        Objects.equals(this.moves, moveMetaAilmentDetail.moves) &&
        Objects.equals(this.names, moveMetaAilmentDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, moves, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaAilmentDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

