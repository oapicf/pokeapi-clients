package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.TypeSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TypeRelationships
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeRelationships   {
  @JsonProperty("no_damage_to")
  
  private List<TypeSummary> noDamageTo = new ArrayList<>();

  @JsonProperty("half_damage_to")
  
  private List<TypeSummary> halfDamageTo = new ArrayList<>();

  @JsonProperty("double_damage_to")
  
  private List<TypeSummary> doubleDamageTo = new ArrayList<>();

  @JsonProperty("no_damage_from")
  
  private List<TypeSummary> noDamageFrom = new ArrayList<>();

  @JsonProperty("half_damage_from")
  
  private List<TypeSummary> halfDamageFrom = new ArrayList<>();

  @JsonProperty("double_damage_from")
  
  private List<TypeSummary> doubleDamageFrom = new ArrayList<>();

  public TypeRelationships noDamageTo(List<TypeSummary> noDamageTo) {
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
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")
  public List<TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeRelationships halfDamageTo(List<TypeSummary> halfDamageTo) {
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
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")
  public List<TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeRelationships doubleDamageTo(List<TypeSummary> doubleDamageTo) {
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
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")
  public List<TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeRelationships noDamageFrom(List<TypeSummary> noDamageFrom) {
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
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")
  public List<TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeRelationships halfDamageFrom(List<TypeSummary> halfDamageFrom) {
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
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")
  public List<TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeRelationships doubleDamageFrom(List<TypeSummary> doubleDamageFrom) {
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
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")
  public List<TypeSummary> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  public void setDoubleDamageFrom(List<TypeSummary> doubleDamageFrom) {
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

