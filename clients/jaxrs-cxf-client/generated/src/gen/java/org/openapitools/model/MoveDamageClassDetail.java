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
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The description of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The description of this resource listed in different languages.")

  private List<MoveDamageClassDescription> descriptions = new ArrayList<>();

 /**
  * A list of moves that fall into this damage class.
  */
  @ApiModelProperty(required = true, value = "A list of moves that fall into this damage class.")

  private List<MoveSummary> moves = new ArrayList<>();

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<MoveDamageClassName> names = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
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
   * The description of this resource listed in different languages.
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  public List<MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }


 /**
   * A list of moves that fall into this damage class.
   * @return moves
  **/
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }


 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<MoveDamageClassName> getNames() {
    return names;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

