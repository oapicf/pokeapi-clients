package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MoveSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveComboUsage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveComboUsage {

  private JsonNullable<List<@Valid MoveSummary>> useBefore = JsonNullable.<List<@Valid MoveSummary>>undefined();

  private JsonNullable<List<@Valid MoveSummary>> useAfter = JsonNullable.<List<@Valid MoveSummary>>undefined();

  public MoveComboUsage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveComboUsage(List<@Valid MoveSummary> useBefore, List<@Valid MoveSummary> useAfter) {
    this.useBefore = JsonNullable.of(useBefore);
    this.useAfter = JsonNullable.of(useAfter);
  }

  public MoveComboUsage useBefore(List<@Valid MoveSummary> useBefore) {
    this.useBefore = JsonNullable.of(useBefore);
    return this;
  }

  public MoveComboUsage addUseBeforeItem(MoveSummary useBeforeItem) {
    if (this.useBefore == null || !this.useBefore.isPresent() || this.useBefore.get() == null) {
      this.useBefore = JsonNullable.of(new ArrayList<>());
    }
    this.useBefore.get().add(useBeforeItem);
    return this;
  }

  /**
   * A list of moves to use before this move.
   * @return useBefore
   */
  /* @Present */ 
  @Schema(name = "use_before", description = "A list of moves to use before this move.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("use_before")
  public JsonNullable<List<@Valid MoveSummary>> getUseBefore() {
    return useBefore;
  }

  @JsonProperty("use_before")
  public void setUseBefore(JsonNullable<List<@Valid MoveSummary>> useBefore) {
    this.useBefore = useBefore;
  }

  public MoveComboUsage useAfter(List<@Valid MoveSummary> useAfter) {
    this.useAfter = JsonNullable.of(useAfter);
    return this;
  }

  public MoveComboUsage addUseAfterItem(MoveSummary useAfterItem) {
    if (this.useAfter == null || !this.useAfter.isPresent() || this.useAfter.get() == null) {
      this.useAfter = JsonNullable.of(new ArrayList<>());
    }
    this.useAfter.get().add(useAfterItem);
    return this;
  }

  /**
   * A list of moves to use after this move.
   * @return useAfter
   */
  /* @Present */ 
  @Schema(name = "use_after", description = "A list of moves to use after this move.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("use_after")
  public JsonNullable<List<@Valid MoveSummary>> getUseAfter() {
    return useAfter;
  }

  @JsonProperty("use_after")
  public void setUseAfter(JsonNullable<List<@Valid MoveSummary>> useAfter) {
    this.useAfter = useAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveComboUsage moveComboUsage = (MoveComboUsage) o;
    return Objects.equals(this.useBefore, moveComboUsage.useBefore) &&
        Objects.equals(this.useAfter, moveComboUsage.useAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useBefore, useAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveComboUsage {\n");
    sb.append("    useBefore: ").append(toIndentedString(useBefore)).append("\n");
    sb.append("    useAfter: ").append(toIndentedString(useAfter)).append("\n");
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

