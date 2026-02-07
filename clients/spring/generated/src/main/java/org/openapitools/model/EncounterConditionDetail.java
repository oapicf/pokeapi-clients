package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionName;
import org.openapitools.model.EncounterConditionValueSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EncounterConditionDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T15:29:13.146999890Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EncounterConditionDetail {

  private Integer id;

  private String name;

  @Valid
  private List<@Valid EncounterConditionValueSummary> values = new ArrayList<>();

  @Valid
  private List<@Valid EncounterConditionName> names = new ArrayList<>();

  public EncounterConditionDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EncounterConditionDetail(Integer id, String name, List<@Valid EncounterConditionValueSummary> values, List<@Valid EncounterConditionName> names) {
    this.id = id;
    this.name = name;
    this.values = values;
    this.names = names;
  }

  public EncounterConditionDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EncounterConditionDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EncounterConditionDetail values(List<@Valid EncounterConditionValueSummary> values) {
    this.values = values;
    return this;
  }

  public EncounterConditionDetail addValuesItem(EncounterConditionValueSummary valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   */
  @NotNull @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<@Valid EncounterConditionValueSummary> getValues() {
    return values;
  }

  public void setValues(List<@Valid EncounterConditionValueSummary> values) {
    this.values = values;
  }

  public EncounterConditionDetail names(List<@Valid EncounterConditionName> names) {
    this.names = names;
    return this;
  }

  public EncounterConditionDetail addNamesItem(EncounterConditionName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid EncounterConditionName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EncounterConditionName> names) {
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
    EncounterConditionDetail encounterConditionDetail = (EncounterConditionDetail) o;
    return Objects.equals(this.id, encounterConditionDetail.id) &&
        Objects.equals(this.name, encounterConditionDetail.name) &&
        Objects.equals(this.values, encounterConditionDetail.values) &&
        Objects.equals(this.names, encounterConditionDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, values, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterConditionDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

