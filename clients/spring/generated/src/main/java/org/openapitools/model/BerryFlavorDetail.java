package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorBerryMap;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BerryFlavorDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class BerryFlavorDetail {

  private Integer id;

  private String name;

  private List<@Valid BerryFlavorBerryMap> berries = new ArrayList<>();

  private ContestTypeSummary contestType;

  private List<@Valid BerryFlavorName> names = new ArrayList<>();

  public BerryFlavorDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BerryFlavorDetail(Integer id, String name, List<@Valid BerryFlavorBerryMap> berries, ContestTypeSummary contestType, List<@Valid BerryFlavorName> names) {
    this.id = id;
    this.name = name;
    this.berries = berries;
    this.contestType = contestType;
    this.names = names;
  }

  public BerryFlavorDetail id(Integer id) {
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

  public BerryFlavorDetail name(String name) {
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

  public BerryFlavorDetail berries(List<@Valid BerryFlavorBerryMap> berries) {
    this.berries = berries;
    return this;
  }

  public BerryFlavorDetail addBerriesItem(BerryFlavorBerryMap berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }
    this.berries.add(berriesItem);
    return this;
  }

  /**
   * A list of the berries with this flavor.
   * @return berries
   */
  
  @Schema(name = "berries", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of the berries with this flavor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("berries")
  public List<@Valid BerryFlavorBerryMap> getBerries() {
    return berries;
  }

  @JsonProperty("berries")
  public void setBerries(List<@Valid BerryFlavorBerryMap> berries) {
    this.berries = berries;
  }

  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  /**
   * The contest type that correlates with this berry flavor.
   * @return contestType
   */
  @NotNull @Valid 
  @Schema(name = "contest_type", description = "The contest type that correlates with this berry flavor.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  @JsonProperty("contest_type")
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  public BerryFlavorDetail addNamesItem(BerryFlavorName namesItem) {
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
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<@Valid BerryFlavorName> names) {
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
    return Objects.equals(this.id, berryFlavorDetail.id) &&
        Objects.equals(this.name, berryFlavorDetail.name) &&
        Objects.equals(this.berries, berryFlavorDetail.berries) &&
        Objects.equals(this.contestType, berryFlavorDetail.contestType) &&
        Objects.equals(this.names, berryFlavorDetail.names);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

