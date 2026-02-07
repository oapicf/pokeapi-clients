package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveDamageClassDescription;
import com.prokarma.pkmst.model.MoveDamageClassName;
import com.prokarma.pkmst.model.MoveSummary;
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
 * MoveDamageClassDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDamageClassDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("descriptions")
  
  private List<MoveDamageClassDescription> descriptions = new ArrayList<>();

  @JsonProperty("moves")
  
  private List<MoveSummary> moves = new ArrayList<>();

  @JsonProperty("names")
  
  private List<MoveDamageClassName> names = new ArrayList<>();

  public MoveDamageClassDetail id(Integer id) {
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

  public MoveDamageClassDetail name(String name) {
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

  public MoveDamageClassDetail descriptions(List<MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveDamageClassDetail addDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
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
  public List<MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveDamageClassDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public MoveDamageClassDetail addMovesItem(MoveSummary movesItem) {
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
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveDamageClassDetail names(List<MoveDamageClassName> names) {
    this.names = names;
    return this;
  }

  public MoveDamageClassDetail addNamesItem(MoveDamageClassName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @ApiModelProperty(required = true, value = "")
  public List<MoveDamageClassName> getNames() {
    return names;
  }

  public void setNames(List<MoveDamageClassName> names) {
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
    MoveDamageClassDetail moveDamageClassDetail = (MoveDamageClassDetail) o;
    return Objects.equals(this.id, moveDamageClassDetail.id) &&
        Objects.equals(this.name, moveDamageClassDetail.name) &&
        Objects.equals(this.descriptions, moveDamageClassDetail.descriptions) &&
        Objects.equals(this.moves, moveDamageClassDetail.moves) &&
        Objects.equals(this.names, moveDamageClassDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDamageClassDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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

