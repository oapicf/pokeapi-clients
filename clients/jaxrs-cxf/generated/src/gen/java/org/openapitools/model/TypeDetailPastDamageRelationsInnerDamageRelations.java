package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeDetailPastDamageRelationsInnerDamageRelations  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();
 /**
   * Get noDamageTo
   * @return noDamageTo
  **/
  @JsonProperty("no_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

 /**
   * Get halfDamageTo
   * @return halfDamageTo
  **/
  @JsonProperty("half_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

 /**
   * Get doubleDamageTo
   * @return doubleDamageTo
  **/
  @JsonProperty("double_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

 /**
   * Get noDamageFrom
   * @return noDamageFrom
  **/
  @JsonProperty("no_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

 /**
   * Get halfDamageFrom
   * @return halfDamageFrom
  **/
  @JsonProperty("half_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

 /**
   * Get doubleDamageFrom
   * @return doubleDamageFrom
  **/
  @JsonProperty("double_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  public void setDoubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
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
    TypeDetailPastDamageRelationsInnerDamageRelations typeDetailPastDamageRelationsInnerDamageRelations = (TypeDetailPastDamageRelationsInnerDamageRelations) o;
    return Objects.equals(this.noDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.noDamageTo) &&
        Objects.equals(this.halfDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.halfDamageTo) &&
        Objects.equals(this.doubleDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.doubleDamageTo) &&
        Objects.equals(this.noDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.noDamageFrom) &&
        Objects.equals(this.halfDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.halfDamageFrom) &&
        Objects.equals(this.doubleDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.doubleDamageFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noDamageTo, halfDamageTo, doubleDamageTo, noDamageFrom, halfDamageFrom, doubleDamageFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailPastDamageRelationsInnerDamageRelations {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

