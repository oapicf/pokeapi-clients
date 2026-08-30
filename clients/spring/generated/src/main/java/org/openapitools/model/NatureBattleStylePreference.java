package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.MoveBattleStyleSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NatureBattleStylePreference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T02:00:43.960184425Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class NatureBattleStylePreference {

  private Integer lowHpPreference;

  private Integer highHpPreference;

  private MoveBattleStyleSummary moveBattleStyle;

  public NatureBattleStylePreference() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NatureBattleStylePreference(Integer lowHpPreference, Integer highHpPreference, MoveBattleStyleSummary moveBattleStyle) {
    this.lowHpPreference = lowHpPreference;
    this.highHpPreference = highHpPreference;
    this.moveBattleStyle = moveBattleStyle;
  }

  public NatureBattleStylePreference lowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
    return this;
  }

  /**
   * Get lowHpPreference
   * @return lowHpPreference
   */
  @NotNull 
  @Schema(name = "low_hp_preference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("low_hp_preference")
  public Integer getLowHpPreference() {
    return lowHpPreference;
  }

  @JsonProperty("low_hp_preference")
  public void setLowHpPreference(Integer lowHpPreference) {
    this.lowHpPreference = lowHpPreference;
  }

  public NatureBattleStylePreference highHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
    return this;
  }

  /**
   * Get highHpPreference
   * @return highHpPreference
   */
  @NotNull 
  @Schema(name = "high_hp_preference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("high_hp_preference")
  public Integer getHighHpPreference() {
    return highHpPreference;
  }

  @JsonProperty("high_hp_preference")
  public void setHighHpPreference(Integer highHpPreference) {
    this.highHpPreference = highHpPreference;
  }

  public NatureBattleStylePreference moveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
    return this;
  }

  /**
   * Get moveBattleStyle
   * @return moveBattleStyle
   */
  @NotNull @Valid 
  @Schema(name = "move_battle_style", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("move_battle_style")
  public MoveBattleStyleSummary getMoveBattleStyle() {
    return moveBattleStyle;
  }

  @JsonProperty("move_battle_style")
  public void setMoveBattleStyle(MoveBattleStyleSummary moveBattleStyle) {
    this.moveBattleStyle = moveBattleStyle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NatureBattleStylePreference natureBattleStylePreference = (NatureBattleStylePreference) o;
    return Objects.equals(this.lowHpPreference, natureBattleStylePreference.lowHpPreference) &&
        Objects.equals(this.highHpPreference, natureBattleStylePreference.highHpPreference) &&
        Objects.equals(this.moveBattleStyle, natureBattleStylePreference.moveBattleStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowHpPreference, highHpPreference, moveBattleStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NatureBattleStylePreference {\n");
    sb.append("    lowHpPreference: ").append(toIndentedString(lowHpPreference)).append("\n");
    sb.append("    highHpPreference: ").append(toIndentedString(highHpPreference)).append("\n");
    sb.append("    moveBattleStyle: ").append(toIndentedString(moveBattleStyle)).append("\n");
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

