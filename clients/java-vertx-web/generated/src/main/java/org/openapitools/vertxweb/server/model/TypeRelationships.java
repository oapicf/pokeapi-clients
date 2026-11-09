package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.TypeSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeRelationships   {
  
  private List<TypeSummary> noDamageTo = new ArrayList<>();
  private List<TypeSummary> halfDamageTo = new ArrayList<>();
  private List<TypeSummary> doubleDamageTo = new ArrayList<>();
  private List<TypeSummary> noDamageFrom = new ArrayList<>();
  private List<TypeSummary> halfDamageFrom = new ArrayList<>();
  private List<TypeSummary> doubleDamageFrom = new ArrayList<>();

  public TypeRelationships () {

  }

  public TypeRelationships (List<TypeSummary> noDamageTo, List<TypeSummary> halfDamageTo, List<TypeSummary> doubleDamageTo, List<TypeSummary> noDamageFrom, List<TypeSummary> halfDamageFrom, List<TypeSummary> doubleDamageFrom) {
    this.noDamageTo = noDamageTo;
    this.halfDamageTo = halfDamageTo;
    this.doubleDamageTo = doubleDamageTo;
    this.noDamageFrom = noDamageFrom;
    this.halfDamageFrom = halfDamageFrom;
    this.doubleDamageFrom = doubleDamageFrom;
  }

    
  @JsonProperty("no_damage_to")
  public List<TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

    
  @JsonProperty("half_damage_to")
  public List<TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

    
  @JsonProperty("double_damage_to")
  public List<TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

    
  @JsonProperty("no_damage_from")
  public List<TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

    
  @JsonProperty("half_damage_from")
  public List<TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

    
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
