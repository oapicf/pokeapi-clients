package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;

/**
 * TypeRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeRelationships   {
  @JsonProperty("no_damage_to")
  private List<@Valid TypeSummary> noDamageTo = new ArrayList<>();

  @JsonProperty("half_damage_to")
  private List<@Valid TypeSummary> halfDamageTo = new ArrayList<>();

  @JsonProperty("double_damage_to")
  private List<@Valid TypeSummary> doubleDamageTo = new ArrayList<>();

  @JsonProperty("no_damage_from")
  private List<@Valid TypeSummary> noDamageFrom = new ArrayList<>();

  @JsonProperty("half_damage_from")
  private List<@Valid TypeSummary> halfDamageFrom = new ArrayList<>();

  @JsonProperty("double_damage_from")
  private List<@Valid TypeSummary> doubleDamageFrom = new ArrayList<>();

  public TypeRelationships noDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeRelationships addNoDamageToItem(TypeSummary noDamageToItem) {
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

   /**
   * A list of types this type has no effect on.
   * @return noDamageTo
  **/
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")
  public List<@Valid TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeRelationships halfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeRelationships addHalfDamageToItem(TypeSummary halfDamageToItem) {
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

   /**
   * A list of types this type is not very effect against.
   * @return halfDamageTo
  **/
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")
  public List<@Valid TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeRelationships doubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeRelationships addDoubleDamageToItem(TypeSummary doubleDamageToItem) {
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

   /**
   * A list of types this type is very effect against.
   * @return doubleDamageTo
  **/
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")
  public List<@Valid TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeRelationships noDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeRelationships addNoDamageFromItem(TypeSummary noDamageFromItem) {
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

   /**
   * A list of types that have no effect on this type.
   * @return noDamageFrom
  **/
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")
  public List<@Valid TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeRelationships halfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeRelationships addHalfDamageFromItem(TypeSummary halfDamageFromItem) {
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

   /**
   * A list of types that are not very effective against this type.
   * @return halfDamageFrom
  **/
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")
  public List<@Valid TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeRelationships doubleDamageFrom(List<@Valid TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeRelationships addDoubleDamageFromItem(TypeSummary doubleDamageFromItem) {
    this.doubleDamageFrom.add(doubleDamageFromItem);
    return this;
  }

   /**
   * A list of types that are very effective against this type.
   * @return doubleDamageFrom
  **/
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")
  public List<@Valid TypeSummary> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

