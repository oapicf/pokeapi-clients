package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveLearnMethodDescription;
import org.openapitools.model.MoveLearnMethodName;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveLearnMethodDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveLearnMethodDetail {

  private Integer id;

  private String name;

  private List<@Valid MoveLearnMethodName> names = new ArrayList<>();

  private List<@Valid MoveLearnMethodDescription> descriptions = new ArrayList<>();

  private List<@Valid VersionGroupSummary> versionGroups = new ArrayList<>();

  public MoveLearnMethodDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveLearnMethodDetail(Integer id, String name, List<@Valid MoveLearnMethodName> names, List<@Valid MoveLearnMethodDescription> descriptions, List<@Valid VersionGroupSummary> versionGroups) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.descriptions = descriptions;
    this.versionGroups = versionGroups;
  }

  public MoveLearnMethodDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public MoveLearnMethodDetail names(List<@Valid MoveLearnMethodName> names) {
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
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid MoveLearnMethodName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
  }

  public MoveLearnMethodDetail descriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
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
  
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of this resource listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty("descriptions")
  public void setDescriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveLearnMethodDetail versionGroups(List<@Valid VersionGroupSummary> versionGroups) {
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
  
  @Schema(name = "version_groups", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of version groups where moves can be learned through this method.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_groups")
  public List<@Valid VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty("version_groups")
  public void setVersionGroups(List<@Valid VersionGroupSummary> versionGroups) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

