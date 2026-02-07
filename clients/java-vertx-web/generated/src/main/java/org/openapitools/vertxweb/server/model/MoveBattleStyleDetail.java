package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MoveBattleStyleName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveBattleStyleDetail   {
  
  private Integer id;
  private String name;
  private List<MoveBattleStyleName> names = new ArrayList<>();

  public MoveBattleStyleDetail () {

  }

  public MoveBattleStyleDetail (Integer id, String name, List<MoveBattleStyleName> names) {
    this.id = id;
    this.name = name;
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

    
  @JsonProperty("names")
  public List<MoveBattleStyleName> getNames() {
    return names;
  }
  public void setNames(List<MoveBattleStyleName> names) {
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
    MoveBattleStyleDetail moveBattleStyleDetail = (MoveBattleStyleDetail) o;
    return Objects.equals(id, moveBattleStyleDetail.id) &&
        Objects.equals(name, moveBattleStyleDetail.name) &&
        Objects.equals(names, moveBattleStyleDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveBattleStyleDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
