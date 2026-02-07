/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 * OpenAPI document version: 2.7.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-02-07T04:17:17.108399996Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailDamageRelations   {
  
  private List<AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  /**
   */
  public TypeDetailDamageRelations noDamageTo(List<AbilityDetailPokemonInnerPokemon> noDamageTo) {
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
   */
  public TypeDetailDamageRelations halfDamageTo(List<AbilityDetailPokemonInnerPokemon> halfDamageTo) {
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
   */
  public TypeDetailDamageRelations doubleDamageTo(List<AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
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
   */
  public TypeDetailDamageRelations noDamageFrom(List<AbilityDetailPokemonInnerPokemon> noDamageFrom) {
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
   */
  public TypeDetailDamageRelations halfDamageFrom(List<AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
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
   */
  public TypeDetailDamageRelations doubleDamageFrom(List<AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
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

