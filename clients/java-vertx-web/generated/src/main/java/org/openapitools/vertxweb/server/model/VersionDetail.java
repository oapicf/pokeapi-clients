package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;
import org.openapitools.vertxweb.server.model.VersionName;

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionDetail   {
  
  private Integer id;
  private String name;
  private List<VersionName> names = new ArrayList<>();
  private VersionGroupSummary versionGroup;

  public VersionDetail () {

  }

  public VersionDetail (Integer id, String name, List<VersionName> names, VersionGroupSummary versionGroup) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.versionGroup = versionGroup;
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
  public List<VersionName> getNames() {
    return names;
  }
  public void setNames(List<VersionName> names) {
    this.names = names;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
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
    return Objects.equals(id, versionDetail.id) &&
        Objects.equals(name, versionDetail.name) &&
        Objects.equals(names, versionDetail.names) &&
        Objects.equals(versionGroup, versionDetail.versionGroup);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
