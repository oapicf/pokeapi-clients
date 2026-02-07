package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EncounterConditionSummary;
import org.openapitools.model.EncounterConditionValueName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EncounterConditionValueDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T15:23:32.871052804Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EncounterConditionValueDetail {

  private Integer id;

  private String name;

  private EncounterConditionSummary condition;

  @Valid
  private List<@Valid EncounterConditionValueName> names = new ArrayList<>();

  public EncounterConditionValueDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EncounterConditionValueDetail(Integer id, String name, EncounterConditionSummary condition, List<@Valid EncounterConditionValueName> names) {
    this.id = id;
    this.name = name;
    this.condition = condition;
    this.names = names;
  }

  public EncounterConditionValueDetail id(Integer id) {
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

  public EncounterConditionValueDetail name(String name) {
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

  public EncounterConditionValueDetail condition(EncounterConditionSummary condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   */
  @NotNull @Valid 
  @Schema(name = "condition", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("condition")
  public EncounterConditionSummary getCondition() {
    return condition;
  }

  public void setCondition(EncounterConditionSummary condition) {
    this.condition = condition;
  }

  public EncounterConditionValueDetail names(List<@Valid EncounterConditionValueName> names) {
    this.names = names;
    return this;
  }

  public EncounterConditionValueDetail addNamesItem(EncounterConditionValueName namesItem) {
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
  public List<@Valid EncounterConditionValueName> getNames() {
    return names;
  }

  public void setNames(List<@Valid EncounterConditionValueName> names) {
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
    EncounterConditionValueDetail encounterConditionValueDetail = (EncounterConditionValueDetail) o;
    return Objects.equals(this.id, encounterConditionValueDetail.id) &&
        Objects.equals(this.name, encounterConditionValueDetail.name) &&
        Objects.equals(this.condition, encounterConditionValueDetail.condition) &&
        Objects.equals(this.names, encounterConditionValueDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, condition, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncounterConditionValueDetail {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

