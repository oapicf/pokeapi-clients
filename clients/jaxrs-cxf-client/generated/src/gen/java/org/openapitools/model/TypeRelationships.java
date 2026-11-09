package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeRelationships  {
  
 /**
  * A list of types this type has no effect on.
  */
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")

  private List<TypeSummary> noDamageTo = new ArrayList<>();

 /**
  * A list of types this type is not very effect against.
  */
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")

  private List<TypeSummary> halfDamageTo = new ArrayList<>();

 /**
  * A list of types this type is very effect against.
  */
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")

  private List<TypeSummary> doubleDamageTo = new ArrayList<>();

 /**
  * A list of types that have no effect on this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")

  private List<TypeSummary> noDamageFrom = new ArrayList<>();

 /**
  * A list of types that are not very effective against this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")

  private List<TypeSummary> halfDamageFrom = new ArrayList<>();

 /**
  * A list of types that are very effective against this type.
  */
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")

  private List<TypeSummary> doubleDamageFrom = new ArrayList<>();
 /**
   * A list of types this type has no effect on.
   * @return noDamageTo
  **/
  @JsonProperty("no_damage_to")
  public List<TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeRelationships noDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeRelationships addNoDamageToItem(TypeSummary noDamageToItem) {
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

 /**
   * A list of types this type is not very effect against.
   * @return halfDamageTo
  **/
  @JsonProperty("half_damage_to")
  public List<TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeRelationships halfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeRelationships addHalfDamageToItem(TypeSummary halfDamageToItem) {
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

 /**
   * A list of types this type is very effect against.
   * @return doubleDamageTo
  **/
  @JsonProperty("double_damage_to")
  public List<TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeRelationships doubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeRelationships addDoubleDamageToItem(TypeSummary doubleDamageToItem) {
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

 /**
   * A list of types that have no effect on this type.
   * @return noDamageFrom
  **/
  @JsonProperty("no_damage_from")
  public List<TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeRelationships noDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeRelationships addNoDamageFromItem(TypeSummary noDamageFromItem) {
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

 /**
   * A list of types that are not very effective against this type.
   * @return halfDamageFrom
  **/
  @JsonProperty("half_damage_from")
  public List<TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeRelationships halfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeRelationships addHalfDamageFromItem(TypeSummary halfDamageFromItem) {
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

 /**
   * A list of types that are very effective against this type.
   * @return doubleDamageFrom
  **/
  @JsonProperty("double_damage_from")
  public List<TypeSummary> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  public void setDoubleDamageFrom(List<TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeRelationships doubleDamageFrom(List<TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

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

