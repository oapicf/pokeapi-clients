package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypeRelationships   {
  
  private List<@Valid TypeSummary> noDamageTo = new ArrayList<>();
  private List<@Valid TypeSummary> halfDamageTo = new ArrayList<>();
  private List<@Valid TypeSummary> doubleDamageTo = new ArrayList<>();
  private List<@Valid TypeSummary> noDamageFrom = new ArrayList<>();
  private List<@Valid TypeSummary> halfDamageFrom = new ArrayList<>();
  private List<@Valid TypeSummary> doubleDamageFrom = new ArrayList<>();

  /**
   * A list of types this type has no effect on.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types this type has no effect on.")
  @JsonProperty("no_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<@Valid TypeSummary> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   * A list of types this type is not very effect against.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types this type is not very effect against.")
  @JsonProperty("half_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<@Valid TypeSummary> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   * A list of types this type is very effect against.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types this type is very effect against.")
  @JsonProperty("double_damage_to")
  @NotNull
  public List<@Valid TypeSummary> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<@Valid TypeSummary> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   * A list of types that have no effect on this type.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types that have no effect on this type.")
  @JsonProperty("no_damage_from")
  @NotNull
  public List<@Valid TypeSummary> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<@Valid TypeSummary> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   * A list of types that are not very effective against this type.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types that are not very effective against this type.")
  @JsonProperty("half_damage_from")
  @NotNull
  public List<@Valid TypeSummary> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<@Valid TypeSummary> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   * A list of types that are very effective against this type.
   **/
  
  @ApiModelProperty(required = true, value = "A list of types that are very effective against this type.")
  @JsonProperty("double_damage_from")
  @NotNull
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

