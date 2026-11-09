package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestTypeDetail  {
  
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
  * The berry flavor that correlates with this contest type.
  */
  @ApiModelProperty(required = true, value = "The berry flavor that correlates with this contest type.")

  private BerryFlavorSummary berryFlavor;

 /**
  * The name of this contest type listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this contest type listed in different languages.")

  private List<ContestTypeName> names = new ArrayList<>();
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

  public ContestTypeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The berry flavor that correlates with this contest type.
   * @return berryFlavor
  **/
  @JsonProperty("berry_flavor")
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }


 /**
   * The name of this contest type listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<ContestTypeName> getNames() {
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
    ContestTypeDetail contestTypeDetail = (ContestTypeDetail) o;
    return Objects.equals(this.id, contestTypeDetail.id) &&
        Objects.equals(this.name, contestTypeDetail.name) &&
        Objects.equals(this.berryFlavor, contestTypeDetail.berryFlavor) &&
        Objects.equals(this.names, contestTypeDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berryFlavor, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestTypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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

