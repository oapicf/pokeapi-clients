package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T15:24:02.238725160Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPastDamageRelationsInnerDamageRelations   {
  
  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("no_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("half_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("double_damage_to")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("no_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("half_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("double_damage_from")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }
  public void setDoubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

