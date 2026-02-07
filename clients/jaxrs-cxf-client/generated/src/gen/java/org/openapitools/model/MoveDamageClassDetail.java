package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveDamageClassDescription;
import org.openapitools.model.MoveDamageClassName;
import org.openapitools.model.MoveSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDamageClassDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<MoveDamageClassDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveDamageClassName> names = new ArrayList<>();
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

  public MoveDamageClassDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveDamageClassDetail descriptions(List<MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveDamageClassDetail addDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
   * Get moves
   * @return moves
  **/
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveDamageClassDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public MoveDamageClassDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<MoveDamageClassName> getNames() {
    return names;
  }

  public void setNames(List<MoveDamageClassName> names) {
    this.names = names;
  }

  public MoveDamageClassDetail names(List<MoveDamageClassName> names) {
    this.names = names;
    return this;
  }

  public MoveDamageClassDetail addNamesItem(MoveDamageClassName namesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

