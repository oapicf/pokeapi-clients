package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TypeRelationships
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeRelationships {

  private List<@Valid TypeSummary> noDamageTo = new ArrayList<>();

  private List<@Valid TypeSummary> halfDamageTo = new ArrayList<>();

  private List<@Valid TypeSummary> doubleDamageTo = new ArrayList<>();

  private List<@Valid TypeSummary> noDamageFrom = new ArrayList<>();

  private List<@Valid TypeSummary> halfDamageFrom = new ArrayList<>();

  private List<@Valid TypeSummary> doubleDamageFrom = new ArrayList<>();

  public TypeRelationships() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeRelationships(List<@Valid TypeSummary> noDamageTo, List<@Valid TypeSummary> halfDamageTo, List<@Valid TypeSummary> doubleDamageTo, List<@Valid TypeSummary> noDamageFrom, List<@Valid TypeSummary> halfDamageFrom, List<@Valid TypeSummary> doubleDamageFrom) {
    this.noDamageTo = noDamageTo;
    this.halfDamageTo = halfDamageTo;
    this.doubleDamageTo = doubleDamageTo;
    this.noDamageFrom = noDamageFrom;
    this.halfDamageFrom = halfDamageFrom;
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeRelationships noDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeRelationships addNoDamageToItem(TypeSummary noDamageToItem) {
    if (this.noDamageTo == null) {
      this.noDamageTo = new ArrayList<>();
    }
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

  /**
   * A list of types this type has no effect on.
   * @return noDamageTo
   */
  @NotNull 
  @Schema(name = "no_damage_to", description = "A list of types this type has no effect on.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("no_damage_to")
  public List<@Valid TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  @JsonProperty("no_damage_to")
  public void setNoDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeRelationships halfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeRelationships addHalfDamageToItem(TypeSummary halfDamageToItem) {
    if (this.halfDamageTo == null) {
      this.halfDamageTo = new ArrayList<>();
    }
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

  /**
   * A list of types this type is not very effect against.
   * @return halfDamageTo
   */
  @NotNull 
  @Schema(name = "half_damage_to", description = "A list of types this type is not very effect against.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("half_damage_to")
  public List<@Valid TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  @JsonProperty("half_damage_to")
  public void setHalfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeRelationships doubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeRelationships addDoubleDamageToItem(TypeSummary doubleDamageToItem) {
    if (this.doubleDamageTo == null) {
      this.doubleDamageTo = new ArrayList<>();
    }
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

  /**
   * A list of types this type is very effect against.
   * @return doubleDamageTo
   */
  @NotNull 
  @Schema(name = "double_damage_to", description = "A list of types this type is very effect against.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("double_damage_to")
  public List<@Valid TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  @JsonProperty("double_damage_to")
  public void setDoubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeRelationships noDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeRelationships addNoDamageFromItem(TypeSummary noDamageFromItem) {
    if (this.noDamageFrom == null) {
      this.noDamageFrom = new ArrayList<>();
    }
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

  /**
   * A list of types that have no effect on this type.
   * @return noDamageFrom
   */
  @NotNull 
  @Schema(name = "no_damage_from", description = "A list of types that have no effect on this type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("no_damage_from")
  public List<@Valid TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  @JsonProperty("no_damage_from")
  public void setNoDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeRelationships halfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeRelationships addHalfDamageFromItem(TypeSummary halfDamageFromItem) {
    if (this.halfDamageFrom == null) {
      this.halfDamageFrom = new ArrayList<>();
    }
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

  /**
   * A list of types that are not very effective against this type.
   * @return halfDamageFrom
   */
  @NotNull 
  @Schema(name = "half_damage_from", description = "A list of types that are not very effective against this type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("half_damage_from")
  public List<@Valid TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  @JsonProperty("half_damage_from")
  public void setHalfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeRelationships doubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeRelationships addDoubleDamageFromItem(TypeSummary doubleDamageFromItem) {
    if (this.doubleDamageFrom == null) {
      this.doubleDamageFrom = new ArrayList<>();
    }
    this.doubleDamageFrom.add(doubleDamageFromItem);
    return this;
  }

  /**
   * A list of types that are very effective against this type.
   * @return doubleDamageFrom
   */
  @NotNull 
  @Schema(name = "double_damage_from", description = "A list of types that are very effective against this type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("double_damage_from")
  public List<@Valid TypeSummary> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  @JsonProperty("double_damage_from")
  public void setDoubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeRelationships typeRelationships = (TypeRelationships) o;
    return Objects.equals(this.noDamageTo, typeRelationships.noDamageTo) &&
        Objects.equals(this.halfDamageTo, typeRelationships.halfDamageTo) &&
        Objects.equals(this.doubleDamageTo, typeRelationships.doubleDamageTo) &&
        Objects.equals(this.noDamageFrom, typeRelationships.noDamageFrom) &&
        Objects.equals(this.halfDamageFrom, typeRelationships.halfDamageFrom) &&
        Objects.equals(this.doubleDamageFrom, typeRelationships.doubleDamageFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noDamageTo, halfDamageTo, doubleDamageTo, noDamageFrom, halfDamageFrom, doubleDamageFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeRelationships {\n");
    sb.append("    noDamageTo: ").append(toIndentedString(noDamageTo)).append("\n");
    sb.append("    halfDamageTo: ").append(toIndentedString(halfDamageTo)).append("\n");
    sb.append("    doubleDamageTo: ").append(toIndentedString(doubleDamageTo)).append("\n");
    sb.append("    noDamageFrom: ").append(toIndentedString(noDamageFrom)).append("\n");
    sb.append("    halfDamageFrom: ").append(toIndentedString(halfDamageFrom)).append("\n");
    sb.append("    doubleDamageFrom: ").append(toIndentedString(doubleDamageFrom)).append("\n");
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

