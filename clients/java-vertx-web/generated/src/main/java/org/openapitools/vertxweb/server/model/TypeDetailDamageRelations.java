package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDetailDamageRelations   {
  
  private List<AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  public TypeDetailDamageRelations () {

  }

  public TypeDetailDamageRelations (List<AbilityDetailPokemonInnerPokemon> noDamageTo, List<AbilityDetailPokemonInnerPokemon> halfDamageTo, List<AbilityDetailPokemonInnerPokemon> doubleDamageTo, List<AbilityDetailPokemonInnerPokemon> noDamageFrom, List<AbilityDetailPokemonInnerPokemon> halfDamageFrom, List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.noDamageTo = noDamageTo;
    this.halfDamageTo = halfDamageTo;
    this.doubleDamageTo = doubleDamageTo;
    this.noDamageFrom = noDamageFrom;
    this.halfDamageFrom = halfDamageFrom;
    this.doubleDamageFrom = doubleDamageFrom;
  }

    
  @JsonProperty("no_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }
  public void setNoDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

    
  @JsonProperty("half_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }
  public void setHalfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

    
  @JsonProperty("double_damage_to")
  public List<AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }
  public void setDoubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

    
  @JsonProperty("no_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }
  public void setNoDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

    
  @JsonProperty("half_damage_from")
  public List<AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }
  public void setHalfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

    
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
    TypeDetailDamageRelations typeDetailDamageRelations = (TypeDetailDamageRelations) o;
    return Objects.equals(noDamageTo, typeDetailDamageRelations.noDamageTo) &&
        Objects.equals(halfDamageTo, typeDetailDamageRelations.halfDamageTo) &&
        Objects.equals(doubleDamageTo, typeDetailDamageRelations.doubleDamageTo) &&
        Objects.equals(noDamageFrom, typeDetailDamageRelations.noDamageFrom) &&
        Objects.equals(halfDamageFrom, typeDetailDamageRelations.halfDamageFrom) &&
        Objects.equals(doubleDamageFrom, typeDetailDamageRelations.doubleDamageFrom);
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
