package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaAilmentName;

/**
 * MoveMetaAilmentDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveMetaAilmentDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("moves")
  private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid MoveMetaAilmentName> names = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public MoveMetaAilmentDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
   * Get moves
   * @return moves
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }

  public void setMoves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }

  public MoveMetaAilmentDetail names(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
    return this;
  }

  public MoveMetaAilmentDetail addNamesItem(MoveMetaAilmentName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid MoveMetaAilmentName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveMetaAilmentName> names) {
    this.names = names;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

