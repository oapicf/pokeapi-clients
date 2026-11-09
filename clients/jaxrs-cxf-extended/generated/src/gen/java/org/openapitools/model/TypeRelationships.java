package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeRelationships  {
  
 /**
  * A list of types this type has no effect on.
  */
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")
  private List<@Valid TypeSummary> noDamageTo = new ArrayList<>();

 /**
  * A list of types this type is not very effect against.
  */
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")
  private List<@Valid TypeSummary> halfDamageTo = new ArrayList<>();

 /**
  * A list of types this type is very effect against.
  */
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")
  private List<@Valid TypeSummary> doubleDamageTo = new ArrayList<>();

 /**
  * A list of types that have no effect on this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")
  private List<@Valid TypeSummary> noDamageFrom = new ArrayList<>();

 /**
  * A list of types that are not very effective against this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")
  private List<@Valid TypeSummary> halfDamageFrom = new ArrayList<>();

 /**
  * A list of types that are very effective against this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")
  private List<@Valid TypeSummary> doubleDamageFrom = new ArrayList<>();
 /**
  * A list of types this type has no effect on.
  * @return noDamageTo
  */
  @JsonProperty("no_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  /**
   * Sets the <code>noDamageTo</code> property.
   */
 public void setNoDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   * Sets the <code>noDamageTo</code> property.
   */
  public TypeRelationships noDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  /**
   * Adds a new item to the <code>noDamageTo</code> list.
   */
  public TypeRelationships addNoDamageToItem(TypeSummary noDamageToItem) {
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

 /**
  * A list of types this type is not very effect against.
  * @return halfDamageTo
  */
  @JsonProperty("half_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  /**
   * Sets the <code>halfDamageTo</code> property.
   */
 public void setHalfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   * Sets the <code>halfDamageTo</code> property.
   */
  public TypeRelationships halfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  /**
   * Adds a new item to the <code>halfDamageTo</code> list.
   */
  public TypeRelationships addHalfDamageToItem(TypeSummary halfDamageToItem) {
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

 /**
  * A list of types this type is very effect against.
  * @return doubleDamageTo
  */
  @JsonProperty("double_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  /**
   * Sets the <code>doubleDamageTo</code> property.
   */
 public void setDoubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   * Sets the <code>doubleDamageTo</code> property.
   */
  public TypeRelationships doubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  /**
   * Adds a new item to the <code>doubleDamageTo</code> list.
   */
  public TypeRelationships addDoubleDamageToItem(TypeSummary doubleDamageToItem) {
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

 /**
  * A list of types that have no effect on this type.
  * @return noDamageFrom
  */
  @JsonProperty("no_damage_from")
  @NotNull
  public List<@Valid TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  /**
   * Sets the <code>noDamageFrom</code> property.
   */
 public void setNoDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   * Sets the <code>noDamageFrom</code> property.
   */
  public TypeRelationships noDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  /**
   * Adds a new item to the <code>noDamageFrom</code> list.
   */
  public TypeRelationships addNoDamageFromItem(TypeSummary noDamageFromItem) {
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

 /**
  * A list of types that are not very effective against this type.
  * @return halfDamageFrom
  */
  @JsonProperty("half_damage_from")
  @NotNull
  public List<@Valid TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  /**
   * Sets the <code>halfDamageFrom</code> property.
   */
 public void setHalfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   * Sets the <code>halfDamageFrom</code> property.
   */
  public TypeRelationships halfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  /**
   * Adds a new item to the <code>halfDamageFrom</code> list.
   */
  public TypeRelationships addHalfDamageFromItem(TypeSummary halfDamageFromItem) {
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

 /**
  * A list of types that are very effective against this type.
  * @return doubleDamageFrom
  */
  @JsonProperty("double_damage_from")
  @NotNull
  public List<@Valid TypeSummary> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  /**
   * Sets the <code>doubleDamageFrom</code> property.
   */
 public void setDoubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  /**
   * Sets the <code>doubleDamageFrom</code> property.
   */
  public TypeRelationships doubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  /**
   * Adds a new item to the <code>doubleDamageFrom</code> list.
   */
  public TypeRelationships addDoubleDamageFromItem(TypeSummary doubleDamageFromItem) {
    this.doubleDamageFrom.add(doubleDamageFromItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

