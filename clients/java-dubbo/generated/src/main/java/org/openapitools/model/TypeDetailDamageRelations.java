package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TypeDetailDamageRelations implements Serializable {
  private static final long serialVersionUID = 1L;

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
   * 
   * @return noDamageTo
   */
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  /**
   * 
   * @return halfDamageTo
   */
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  /**
   * 
   * @return doubleDamageTo
   */
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  /**
   * 
   * @return noDamageFrom
   */
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  /**
   * 
   * @return halfDamageFrom
   */
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  /**
   * 
   * @return doubleDamageFrom
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
