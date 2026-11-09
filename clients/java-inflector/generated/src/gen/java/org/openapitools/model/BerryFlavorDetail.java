package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorBerryMap;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("berries")
  private List<BerryFlavorBerryMap> berries = new ArrayList<>();

  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  @JsonProperty("names")
  private List<BerryFlavorName> names = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  public BerryFlavorDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public BerryFlavorDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of the berries with this flavor.
   **/
  public BerryFlavorDetail berries(List<BerryFlavorBerryMap> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of the berries with this flavor.")
  @JsonProperty("berries")
  public List<BerryFlavorBerryMap> getBerries() {
    return berries;
  }
  public void setBerries(List<BerryFlavorBerryMap> berries) {
    this.berries = berries;
  }

  /**
   * The contest type that correlates with this berry flavor.
   **/
  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The contest type that correlates with this berry flavor.")
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public BerryFlavorDetail names(List<BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty("names")
  public List<BerryFlavorName> getNames() {
    return names;
  }
  public void setNames(List<BerryFlavorName> names) {
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
    BerryFlavorDetail berryFlavorDetail = (BerryFlavorDetail) o;
    return Objects.equals(id, berryFlavorDetail.id) &&
        Objects.equals(name, berryFlavorDetail.name) &&
        Objects.equals(berries, berryFlavorDetail.berries) &&
        Objects.equals(contestType, berryFlavorDetail.contestType) &&
        Objects.equals(names, berryFlavorDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berries, contestType, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

