package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;

/**
 * ContestTypeDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ContestTypeDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("berry_flavor")
  private BerryFlavorSummary berryFlavor;

  @JsonProperty("names")
  private List<@Valid ContestTypeName> names = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public ContestTypeDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Get berryFlavor
   * @return berryFlavor
  **/
  @ApiModelProperty(required = true, value = "")
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }

  public ContestTypeDetail names(List<@Valid ContestTypeName> names) {
    this.names = names;
    return this;
  }

  public ContestTypeDetail addNamesItem(ContestTypeName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid ContestTypeName> getNames() {
    return names;
  }

  public void setNames(List<@Valid ContestTypeName> names) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

