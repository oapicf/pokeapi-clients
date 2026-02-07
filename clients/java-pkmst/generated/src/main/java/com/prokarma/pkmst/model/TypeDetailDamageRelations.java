package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.AbilityDetailPokemonInnerPokemon;
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
 * TypeDetailDamageRelations
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-02-07T04:17:07.396624034Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailDamageRelations   {
  @JsonProperty("no_damage_to")
  
  private List<AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();

  @JsonProperty("half_damage_to")
  
  private List<AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();

  @JsonProperty("double_damage_to")
  
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();

  @JsonProperty("no_damage_from")
  
  private List<AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();

  @JsonProperty("half_damage_from")
  
  private List<AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();

  @JsonProperty("double_damage_from")
  
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  public TypeDetailDamageRelations noDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
    if (this.noDamageTo == null) {
      this.noDamageTo = new ArrayList<>();
    }
    this.noDamageTo.add(noDamageToItem);
    return this;
  }

  /**
   * Get noDamageTo
   * @return noDamageTo
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeDetailDamageRelations halfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
    if (this.halfDamageTo == null) {
      this.halfDamageTo = new ArrayList<>();
    }
    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

  /**
   * Get halfDamageTo
   * @return halfDamageTo
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeDetailDamageRelations doubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeDetailDamageRelations addDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
    if (this.doubleDamageTo == null) {
      this.doubleDamageTo = new ArrayList<>();
    }
    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

  /**
   * Get doubleDamageTo
   * @return doubleDamageTo
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeDetailDamageRelations noDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
    if (this.noDamageFrom == null) {
      this.noDamageFrom = new ArrayList<>();
    }
    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

  /**
   * Get noDamageFrom
   * @return noDamageFrom
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeDetailDamageRelations halfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
    if (this.halfDamageFrom == null) {
      this.halfDamageFrom = new ArrayList<>();
    }
    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

  /**
   * Get halfDamageFrom
   * @return halfDamageFrom
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeDetailDamageRelations doubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeDetailDamageRelations addDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
    if (this.doubleDamageFrom == null) {
      this.doubleDamageFrom = new ArrayList<>();
    }
    this.doubleDamageFrom.add(doubleDamageFromItem);
    return this;
  }

  /**
   * Get doubleDamageFrom
   * @return doubleDamageFrom
   */
  @ApiModelProperty(required = true, value = "")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  public void setDoubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

