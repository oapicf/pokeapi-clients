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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-11-09T13:49:15.621225368Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  /**
   * A list of types this type has no effect on.
   **/
  public TypeRelationships noDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")
  @JsonProperty("no_damage_to")
  public List<TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   * A list of types this type is not very effect against.
   **/
  public TypeRelationships halfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")
  @JsonProperty("half_damage_to")
  public List<TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   * A list of types this type is very effect against.
   **/
  public TypeRelationships doubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")
  @JsonProperty("double_damage_to")
  public List<TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   * A list of types that have no effect on this type.
   **/
  public TypeRelationships noDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")
  @JsonProperty("no_damage_from")
  public List<TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   * A list of types that are not very effective against this type.
   **/
  public TypeRelationships halfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")
  @JsonProperty("half_damage_from")
  public List<TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   * A list of types that are very effective against this type.
   **/
  public TypeRelationships doubleDamageFrom(List<TypeSummary> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")
  @JsonProperty("double_damage_from")
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
    return Objects.equals(noDamageTo, typeRelationships.noDamageTo) &&
        Objects.equals(halfDamageTo, typeRelationships.halfDamageTo) &&
        Objects.equals(doubleDamageTo, typeRelationships.doubleDamageTo) &&
        Objects.equals(noDamageFrom, typeRelationships.noDamageFrom) &&
        Objects.equals(halfDamageFrom, typeRelationships.halfDamageFrom) &&
        Objects.equals(doubleDamageFrom, typeRelationships.doubleDamageFrom);
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

