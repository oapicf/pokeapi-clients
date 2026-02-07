package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeDetailDamageRelations  {
  
  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();
 /**
   * Get noDamageTo
   * @return noDamageTo
  **/
  @JsonProperty("no_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeDetailDamageRelations noDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

 /**
   * Get halfDamageTo
   * @return halfDamageTo
  **/
  @JsonProperty("half_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeDetailDamageRelations halfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

 /**
   * Get doubleDamageTo
   * @return doubleDamageTo
  **/
  @JsonProperty("double_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeDetailDamageRelations doubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

 /**
   * Get noDamageFrom
   * @return noDamageFrom
  **/
  @JsonProperty("no_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeDetailDamageRelations noDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

 /**
   * Get halfDamageFrom
   * @return halfDamageFrom
  **/
  @JsonProperty("half_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeDetailDamageRelations halfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

 /**
   * Get doubleDamageFrom
   * @return doubleDamageFrom
  **/
  @JsonProperty("double_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  public void setDoubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeDetailDamageRelations doubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
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
    TypeDetailDamageRelations typeDetailDamageRelations = (TypeDetailDamageRelations) o;
    return Objects.equals(this.noDamageTo, typeDetailDamageRelations.noDamageTo) &&
        Objects.equals(this.halfDamageTo, typeDetailDamageRelations.halfDamageTo) &&
        Objects.equals(this.doubleDamageTo, typeDetailDamageRelations.doubleDamageTo) &&
        Objects.equals(this.noDamageFrom, typeDetailDamageRelations.noDamageFrom) &&
        Objects.equals(this.halfDamageFrom, typeDetailDamageRelations.halfDamageFrom) &&
        Objects.equals(this.doubleDamageFrom, typeDetailDamageRelations.doubleDamageFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noDamageTo, halfDamageTo, doubleDamageTo, noDamageFrom, halfDamageFrom, doubleDamageFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailDamageRelations {\n");
    
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

