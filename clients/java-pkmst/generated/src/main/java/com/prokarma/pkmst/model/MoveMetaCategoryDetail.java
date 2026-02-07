package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
import com.prokarma.pkmst.model.MoveMetaCategoryDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveMetaCategoryDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveMetaCategoryDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("descriptions")
  
  private List<MoveMetaCategoryDescription> descriptions = new ArrayList<>();

  @JsonProperty("moves")
  
  private List<AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();

  public MoveMetaCategoryDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveMetaCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveMetaCategoryDetail descriptions(List<MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveMetaCategoryDetail addDescriptionsItem(MoveMetaCategoryDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
   */
  @ApiModelProperty(required = true, value = "")
  public List<MoveMetaCategoryDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveMetaCategoryDetail moves(List<AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
    return this;
  }

  public MoveMetaCategoryDetail addMovesItem(AbilityDetailPokemonInnerPokemon movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }

  /**
   * Get moves
   * @return moves
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getMoves() {
    return moves;
  }

  public void setMoves(List<AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaCategoryDetail moveMetaCategoryDetail = (MoveMetaCategoryDetail) o;
    return Objects.equals(this.id, moveMetaCategoryDetail.id) &&
        Objects.equals(this.name, moveMetaCategoryDetail.name) &&
        Objects.equals(this.descriptions, moveMetaCategoryDetail.descriptions) &&
        Objects.equals(this.moves, moveMetaCategoryDetail.moves);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaCategoryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
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

