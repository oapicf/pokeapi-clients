package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaAilmentName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMetaAilmentDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveMetaAilmentName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
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
  public List<AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }

  public void setMoves(List<AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }

  public MoveMetaAilmentDetail moves(List<AbilityDetailPokemonInnerPokemon> moves) {
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
  public List<MoveMetaAilmentName> getNames() {
    return names;
  }

  public void setNames(List<MoveMetaAilmentName> names) {
    this.names = names;
  }

  public MoveMetaAilmentDetail names(List<MoveMetaAilmentName> names) {
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

