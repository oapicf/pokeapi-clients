package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.openapitools.model.MoveTargetDescription;
import org.openapitools.model.MoveTargetName;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MoveTargetDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid MoveTargetDescription> descriptions = new ArrayList<>();

  private List<@Valid MoveSummary> moves = new ArrayList<>();

  private List<@Valid MoveTargetName> names = new ArrayList<>();

  /**
   **/
  public MoveTargetDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public MoveTargetDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public MoveTargetDetail descriptions(List<@Valid MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid MoveTargetDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<@Valid MoveTargetDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveTargetDetail addDescriptionsItem(MoveTargetDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }


  /**
   **/
  public MoveTargetDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveTargetDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }
    this.moves.add(movesItem);
    return this;
  }


  /**
   **/
  public MoveTargetDetail names(List<@Valid MoveTargetName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveTargetName> getNames() {
    return names;
  }
  public void setNames(List<@Valid MoveTargetName> names) {
    this.names = names;
  }

  public MoveTargetDetail addNamesItem(MoveTargetName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

