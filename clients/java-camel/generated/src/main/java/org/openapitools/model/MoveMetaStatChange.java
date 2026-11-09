package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.StatSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveMetaStatChange
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveMetaStatChange {

  private Integer change;

  private StatSummary stat;

  public MoveMetaStatChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveMetaStatChange(Integer change, StatSummary stat) {
    this.change = change;
    this.stat = stat;
  }

  public MoveMetaStatChange change(Integer change) {
    this.change = change;
    return this;
  }

  /**
   * The amount of change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return change
   */
  @NotNull @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "change", description = "The amount of change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("change")
  public Integer getChange() {
    return change;
  }

  public void setChange(Integer change) {
    this.change = change;
  }

  public MoveMetaStatChange stat(StatSummary stat) {
    this.stat = stat;
    return this;
  }

  /**
   * The stat being affected.
   * @return stat
   */
  @NotNull @Valid 
  @Schema(name = "stat", description = "The stat being affected.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stat")
  public StatSummary getStat() {
    return stat;
  }

  public void setStat(StatSummary stat) {
    this.stat = stat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveMetaStatChange moveMetaStatChange = (MoveMetaStatChange) o;
    return Objects.equals(this.change, moveMetaStatChange.change) &&
        Objects.equals(this.stat, moveMetaStatChange.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveMetaStatChange {\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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

