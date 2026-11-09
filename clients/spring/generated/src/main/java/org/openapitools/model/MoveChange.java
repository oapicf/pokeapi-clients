package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MoveEffectEffectText;
import org.openapitools.model.TypeSummary;
import org.openapitools.model.VersionGroupSummary;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MoveChange
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class MoveChange {

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> accuracy = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> power = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> pp = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> effectChance = JsonNullable.<Integer>undefined();

  private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();

  private JsonNullable<TypeSummary> type = JsonNullable.<TypeSummary>undefined();

  private VersionGroupSummary versionGroup;

  public MoveChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MoveChange(Integer effectChance, List<@Valid MoveEffectEffectText> effectEntries, TypeSummary type, VersionGroupSummary versionGroup) {
    this.effectChance = JsonNullable.of(effectChance);
    this.effectEntries = effectEntries;
    this.type = JsonNullable.of(type);
    this.versionGroup = versionGroup;
  }

  public MoveChange accuracy(Integer accuracy) {
    this.accuracy = JsonNullable.of(accuracy);
    return this;
  }

  /**
   * The percent value of how likely this move is to be successful.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accuracy
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "accuracy", description = "The percent value of how likely this move is to be successful.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("accuracy")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(JsonNullable<Integer> accuracy) {
    this.accuracy = accuracy;
  }

  public MoveChange power(Integer power) {
    this.power = JsonNullable.of(power);
    return this;
  }

  /**
   * The base power before the listed version group, or null if power did not change.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return power
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "power", description = "The base power before the listed version group, or null if power did not change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("power")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPower() {
    return power;
  }

  public void setPower(JsonNullable<Integer> power) {
    this.power = power;
  }

  public MoveChange pp(Integer pp) {
    this.pp = JsonNullable.of(pp);
    return this;
  }

  /**
   * Power points. The number of times this move can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return pp
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "pp", description = "Power points. The number of times this move can be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("pp")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getPp() {
    return pp;
  }

  public void setPp(JsonNullable<Integer> pp) {
    this.pp = pp;
  }

  public MoveChange effectChance(Integer effectChance) {
    this.effectChance = JsonNullable.of(effectChance);
    return this;
  }

  /**
   * The percent value of how likely it is this moves effect will take effect.
   * @return effectChance
   */
  /* @Present */ 
  @Schema(name = "effect_chance", description = "The percent value of how likely it is this moves effect will take effect.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("effect_chance")
  public JsonNullable<Integer> getEffectChance() {
    return effectChance;
  }

  @JsonProperty("effect_chance")
  public void setEffectChance(JsonNullable<Integer> effectChance) {
    this.effectChance = effectChance;
  }

  public MoveChange effectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveChange addEffectEntriesItem(MoveEffectEffectText effectEntriesItem) {
    if (this.effectEntries == null) {
      this.effectEntries = new ArrayList<>();
    }
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

  /**
   * The effect of this move listed in different languages.
   * @return effectEntries
   */
  
  @Schema(name = "effect_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The effect of this move listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("effect_entries")
  public List<@Valid MoveEffectEffectText> getEffectEntries() {
    return effectEntries;
  }

  @JsonProperty("effect_entries")
  public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveChange type(TypeSummary type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * The elemental type of this move.
   * @return type
   */
  /* @Present */ @Valid 
  @Schema(name = "type", description = "The elemental type of this move.", requiredMode = Schema.RequiredMode.REQUIRED, nullable = true)
  @JsonProperty("type")
  public JsonNullable<TypeSummary> getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(JsonNullable<TypeSummary> type) {
    this.type = type;
  }

  public MoveChange versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group in which these move stat values were in effect.
   * @return versionGroup
   */
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group in which these move stat values were in effect.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty("version_group")
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
    MoveChange moveChange = (MoveChange) o;
    return equalsNullable(this.accuracy, moveChange.accuracy) &&
        equalsNullable(this.power, moveChange.power) &&
        equalsNullable(this.pp, moveChange.pp) &&
        Objects.equals(this.effectChance, moveChange.effectChance) &&
        Objects.equals(this.effectEntries, moveChange.effectEntries) &&
        Objects.equals(this.type, moveChange.type) &&
        Objects.equals(this.versionGroup, moveChange.versionGroup);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accuracy), hashCodeNullable(power), hashCodeNullable(pp), effectChance, effectEntries, type, versionGroup);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveChange {\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

