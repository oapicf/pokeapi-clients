package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VersionGroupSummary;
import org.openapitools.model.VersionName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 */
@ApiModel(description="Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink")

public class VersionDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid VersionName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private VersionGroupSummary versionGroup;
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

  public VersionDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid VersionName> getNames() {
    return names;
  }

  public void setNames(List<@Valid VersionName> names) {
    this.names = names;
  }

  public VersionDetail names(List<@Valid VersionName> names) {
    this.names = names;
    return this;
  }

  public VersionDetail addNamesItem(VersionName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public VersionDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
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
    VersionDetail versionDetail = (VersionDetail) o;
    return Objects.equals(this.id, versionDetail.id) &&
        Objects.equals(this.name, versionDetail.name) &&
        Objects.equals(this.names, versionDetail.names) &&
        Objects.equals(this.versionGroup, versionDetail.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

