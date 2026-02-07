package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveBattleStyleName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveBattleStyleDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid MoveBattleStyleName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveBattleStyleDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveBattleStyleName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveBattleStyleName> names) {
    this.names = names;
  }

  public MoveBattleStyleDetail names(List<@Valid MoveBattleStyleName> names) {
    this.names = names;
    return this;
  }

  public MoveBattleStyleDetail addNamesItem(MoveBattleStyleName namesItem) {
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
    MoveBattleStyleDetail moveBattleStyleDetail = (MoveBattleStyleDetail) o;
    return Objects.equals(this.id, moveBattleStyleDetail.id) &&
        Objects.equals(this.name, moveBattleStyleDetail.name) &&
        Objects.equals(this.names, moveBattleStyleDetail.names);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

