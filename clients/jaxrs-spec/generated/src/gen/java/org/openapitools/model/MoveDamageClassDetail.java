package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveDamageClassDescription;
import org.openapitools.model.MoveDamageClassName;
import org.openapitools.model.MoveSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MoveDamageClassDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDamageClassDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid MoveDamageClassDescription> descriptions = new ArrayList<>();
  private @Valid List<@Valid MoveSummary> moves = new ArrayList<>();
  private @Valid List<@Valid MoveDamageClassName> names = new ArrayList<>();

  public MoveDamageClassDetail() {
  }

  @JsonCreator
  public MoveDamageClassDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "descriptions") List<@Valid MoveDamageClassDescription> descriptions,
    @JsonProperty(required = true, value = "moves") List<@Valid MoveSummary> moves,
    @JsonProperty(required = true, value = "names") List<@Valid MoveDamageClassName> names
  ) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.moves = moves;
    this.names = names;
  }

  /**
   **/
  public MoveDamageClassDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public MoveDamageClassDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public MoveDamageClassDetail descriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "descriptions")
  @NotNull @Valid public List<@Valid MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty(required = true, value = "descriptions")
  public void setDescriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveDamageClassDetail addDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }

    this.descriptions.add(descriptionsItem);
    return this;
  }

  public MoveDamageClassDetail removeDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
    if (descriptionsItem != null && this.descriptions != null) {
      this.descriptions.remove(descriptionsItem);
    }

    return this;
  }
  /**
   **/
  public MoveDamageClassDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "moves")
  @NotNull @Valid public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  @JsonProperty(required = true, value = "moves")
  public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  public MoveDamageClassDetail addMovesItem(MoveSummary movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<>();
    }

    this.moves.add(movesItem);
    return this;
  }

  public MoveDamageClassDetail removeMovesItem(MoveSummary movesItem) {
    if (movesItem != null && this.moves != null) {
      this.moves.remove(movesItem);
    }

    return this;
  }
  /**
   **/
  public MoveDamageClassDetail names(List<@Valid MoveDamageClassName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid MoveDamageClassName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid MoveDamageClassName> names) {
    this.names = names;
  }

  public MoveDamageClassDetail addNamesItem(MoveDamageClassName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public MoveDamageClassDetail removeNamesItem(MoveDamageClassName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

