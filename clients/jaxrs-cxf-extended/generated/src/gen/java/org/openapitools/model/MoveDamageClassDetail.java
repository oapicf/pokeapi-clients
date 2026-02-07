package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveDamageClassDescription;
import org.openapitools.model.MoveDamageClassName;
import org.openapitools.model.MoveSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDamageClassDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveDamageClassDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveSummary> moves = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveDamageClassName> names = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MoveDamageClassDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public MoveDamageClassDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get descriptions
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
 public void setDescriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
  public MoveDamageClassDetail descriptions(List<@Valid MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   */
  public MoveDamageClassDetail addDescriptionsItem(MoveDamageClassDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
  * Get moves
  * @return moves
  */
  @JsonProperty("moves")
  @NotNull
  public List<@Valid MoveSummary> getMoves() {
    return moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
 public void setMoves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
  }

  /**
   * Sets the <code>moves</code> property.
   */
  public MoveDamageClassDetail moves(List<@Valid MoveSummary> moves) {
    this.moves = moves;
    return this;
  }

  /**
   * Adds a new item to the <code>moves</code> list.
   */
  public MoveDamageClassDetail addMovesItem(MoveSummary movesItem) {
    this.moves.add(movesItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveDamageClassName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid MoveDamageClassName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public MoveDamageClassDetail names(List<@Valid MoveDamageClassName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
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

