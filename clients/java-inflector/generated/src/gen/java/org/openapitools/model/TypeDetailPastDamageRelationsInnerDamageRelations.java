package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPastDamageRelationsInnerDamageRelations   {
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

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("no_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("half_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("double_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("no_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("half_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   **/
  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("double_damage_from")
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
    TypeDetailPastDamageRelationsInnerDamageRelations typeDetailPastDamageRelationsInnerDamageRelations = (TypeDetailPastDamageRelationsInnerDamageRelations) o;
    return Objects.equals(noDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.noDamageTo) &&
        Objects.equals(halfDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.halfDamageTo) &&
        Objects.equals(doubleDamageTo, typeDetailPastDamageRelationsInnerDamageRelations.doubleDamageTo) &&
        Objects.equals(noDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.noDamageFrom) &&
        Objects.equals(halfDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.halfDamageFrom) &&
        Objects.equals(doubleDamageFrom, typeDetailPastDamageRelationsInnerDamageRelations.doubleDamageFrom);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

