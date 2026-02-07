package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveDamageClassDescription;
import org.openapitools.vertxweb.server.model.MoveDamageClassName;
import org.openapitools.vertxweb.server.model.MoveSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDamageClassDetail   {
  
  private Integer id;
  private String name;
  private List<MoveDamageClassDescription> descriptions = new ArrayList<>();
  private List<MoveSummary> moves = new ArrayList<>();
  private List<MoveDamageClassName> names = new ArrayList<>();

  public MoveDamageClassDetail () {

  }

  public MoveDamageClassDetail (Integer id, String name, List<MoveDamageClassDescription> descriptions, List<MoveSummary> moves, List<MoveDamageClassName> names) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.moves = moves;
    this.names = names;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("descriptions")
  public List<MoveDamageClassDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<MoveDamageClassDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("moves")
  public List<MoveSummary> getMoves() {
    return moves;
  }
  public void setMoves(List<MoveSummary> moves) {
    this.moves = moves;
  }

    
  @JsonProperty("names")
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
    return Objects.equals(id, moveDamageClassDetail.id) &&
        Objects.equals(name, moveDamageClassDetail.name) &&
        Objects.equals(descriptions, moveDamageClassDetail.descriptions) &&
        Objects.equals(moves, moveDamageClassDetail.moves) &&
        Objects.equals(names, moveDamageClassDetail.names);
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
