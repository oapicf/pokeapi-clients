package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveMetaCategoryDescription;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveMetaCategoryDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid MoveMetaCategoryDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> moves = new ArrayList<>();
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

  public MoveMetaCategoryDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid MoveMetaCategoryDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveMetaCategoryDetail descriptions(List<@Valid MoveMetaCategoryDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveMetaCategoryDetail addDescriptionsItem(MoveMetaCategoryDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
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

  public MoveMetaCategoryDetail moves(List<@Valid AbilityDetailPokemonInnerPokemon> moves) {
    this.moves = moves;
    return this;
  }

  public MoveMetaCategoryDetail addMovesItem(AbilityDetailPokemonInnerPokemon movesItem) {
    this.moves.add(movesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

