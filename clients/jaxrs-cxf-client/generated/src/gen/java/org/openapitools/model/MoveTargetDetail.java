package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.MoveTargetDescription;
import org.openapitools.model.MoveTargetName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveTargetDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<MoveTargetDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<MoveTargetName> names = new ArrayList<>();
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

  public MoveTargetDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get descriptions
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<MoveTargetDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveTargetDetail descriptions(List<MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveTargetDetail addDescriptionsItem(MoveTargetDescription descriptionsItem) {
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

  public MoveTargetDetail moves(List<MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  public MoveTargetDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<MoveTargetName> getNames() {
    return names;
  }

  public void setNames(List<MoveTargetName> names) {
    this.names = names;
  }

  public MoveTargetDetail names(List<MoveTargetName> names) {
    this.names = names;
    return this;
  }

  public MoveTargetDetail addNamesItem(MoveTargetName namesItem) {
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
    MoveTargetDetail moveTargetDetail = (MoveTargetDetail) o;
    return Objects.equals(this.id, moveTargetDetail.id) &&
        Objects.equals(this.name, moveTargetDetail.name) &&
        Objects.equals(this.descriptions, moveTargetDetail.descriptions) &&
        Objects.equals(this.moves, moveTargetDetail.moves) &&
        Objects.equals(this.names, moveTargetDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptions, moves, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveTargetDetail {\n");
    
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

