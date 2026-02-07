package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveSummary;
import org.openapitools.vertxweb.server.model.MoveTargetDescription;
import org.openapitools.vertxweb.server.model.MoveTargetName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveTargetDetail   {
  
  private Integer id;
  private String name;
  private List<MoveTargetDescription> descriptions = new ArrayList<>();
  private List<MoveSummary> moves = new ArrayList<>();
  private List<MoveTargetName> names = new ArrayList<>();

  public MoveTargetDetail () {

  }

  public MoveTargetDetail (Integer id, String name, List<MoveTargetDescription> descriptions, List<MoveSummary> moves, List<MoveTargetName> names) {
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
  public List<MoveTargetDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<MoveTargetDescription> descriptions) {
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
  public List<MoveTargetName> getNames() {
    return names;
  }
  public void setNames(List<MoveTargetName> names) {
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
    MoveTargetDetail moveTargetDetail = (MoveTargetDetail) o;
    return Objects.equals(id, moveTargetDetail.id) &&
        Objects.equals(name, moveTargetDetail.name) &&
        Objects.equals(descriptions, moveTargetDetail.descriptions) &&
        Objects.equals(moves, moveTargetDetail.moves) &&
        Objects.equals(names, moveTargetDetail.names);
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
