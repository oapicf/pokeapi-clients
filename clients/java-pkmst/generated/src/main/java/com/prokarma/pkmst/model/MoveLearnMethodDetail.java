package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MoveLearnMethodDescription;
import com.prokarma.pkmst.model.MoveLearnMethodName;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MoveLearnMethodDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveLearnMethodDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("names")
  
  private List<MoveLearnMethodName> names = new ArrayList<>();

  @JsonProperty("descriptions")
  
  private List<MoveLearnMethodDescription> descriptions = new ArrayList<>();

  @JsonProperty("version_groups")
  
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  public MoveLearnMethodDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveLearnMethodDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveLearnMethodDetail names(List<MoveLearnMethodName> names) {
    this.names = names;
    return this;
  }

  public MoveLearnMethodDetail addNamesItem(MoveLearnMethodName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<MoveLearnMethodName> getNames() {
    return names;
  }

  public void setNames(List<MoveLearnMethodName> names) {
    this.names = names;
  }

  public MoveLearnMethodDetail descriptions(List<MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveLearnMethodDetail addDescriptionsItem(MoveLearnMethodDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * The description of this resource listed in different languages.
   * @return descriptions
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The description of this resource listed in different languages.")
  public List<MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveLearnMethodDetail versionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public MoveLearnMethodDetail addVersionGroupsItem(VersionGroupSummary versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  /**
   * A list of version groups where moves can be learned through this method.
   * @return versionGroups
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of version groups where moves can be learned through this method.")
  public List<VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveLearnMethodDetail moveLearnMethodDetail = (MoveLearnMethodDetail) o;
    return Objects.equals(this.id, moveLearnMethodDetail.id) &&
        Objects.equals(this.name, moveLearnMethodDetail.name) &&
        Objects.equals(this.names, moveLearnMethodDetail.names) &&
        Objects.equals(this.descriptions, moveLearnMethodDetail.descriptions) &&
        Objects.equals(this.versionGroups, moveLearnMethodDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, descriptions, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveLearnMethodDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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

