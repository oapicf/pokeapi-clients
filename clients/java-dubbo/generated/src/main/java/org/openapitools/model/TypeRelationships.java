package org.openapitools.model;

import org.openapitools.model.TypeSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class TypeRelationships implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of types this type has no effect on.
   */
  @JsonProperty("no_damage_to")
  private List<TypeSummary> noDamageTo = new ArrayList<>();

  /**
   * A list of types this type is not very effect against.
   */
  @JsonProperty("half_damage_to")
  private List<TypeSummary> halfDamageTo = new ArrayList<>();

  /**
   * A list of types this type is very effect against.
   */
  @JsonProperty("double_damage_to")
  private List<TypeSummary> doubleDamageTo = new ArrayList<>();

  /**
   * A list of types that have no effect on this type.
   */
  @JsonProperty("no_damage_from")
  private List<TypeSummary> noDamageFrom = new ArrayList<>();

  /**
   * A list of types that are not very effective against this type.
   */
  @JsonProperty("half_damage_from")
  private List<TypeSummary> halfDamageFrom = new ArrayList<>();

  /**
   * A list of types that are very effective against this type.
   */
  @JsonProperty("double_damage_from")
  private List<TypeSummary> doubleDamageFrom = new ArrayList<>();

  /**
   * A list of types this type has no effect on.
   * @return noDamageTo
   */
  public List<TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   * A list of types this type is not very effect against.
   * @return halfDamageTo
   */
  public List<TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   * A list of types this type is very effect against.
   * @return doubleDamageTo
   */
  public List<TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   * A list of types that have no effect on this type.
   * @return noDamageFrom
   */
  public List<TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   * A list of types that are not very effective against this type.
   * @return halfDamageFrom
   */
  public List<TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   * A list of types that are very effective against this type.
   * @return doubleDamageFrom
   */
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
