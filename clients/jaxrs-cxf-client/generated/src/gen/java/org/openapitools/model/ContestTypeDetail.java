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
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private BerryFlavorSummary berryFlavor;

  @ApiModelProperty(required = true, value = "")

  private List<ContestTypeName> names = new ArrayList<>();
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

  public ContestTypeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get berryFlavor
   * @return berryFlavor
  **/
  @JsonProperty("berry_flavor")
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }


 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<ContestTypeName> getNames() {
    return names;
  }

  public void setNames(List<ContestTypeName> names) {
    this.names = names;
  }

  public ContestTypeDetail names(List<ContestTypeName> names) {
    this.names = names;
    return this;
  }

  public ContestTypeDetail addNamesItem(ContestTypeName namesItem) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

