package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("TypeDetail_damage_relations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailDamageRelations   {
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  public TypeDetailDamageRelations() {
  }

  @JsonCreator
  public TypeDetailDamageRelations(
    @JsonProperty(required = true, value = "no_damage_to") List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo,
    @JsonProperty(required = true, value = "half_damage_to") List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo,
    @JsonProperty(required = true, value = "double_damage_to") List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo,
    @JsonProperty(required = true, value = "no_damage_from") List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom,
    @JsonProperty(required = true, value = "half_damage_from") List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom,
    @JsonProperty(required = true, value = "double_damage_from") List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom
  ) {
    this.noDamageTo = noDamageTo;
    this.halfDamageTo = halfDamageTo;
    this.doubleDamageTo = doubleDamageTo;
    this.noDamageFrom = noDamageFrom;
    this.halfDamageFrom = halfDamageFrom;
    this.doubleDamageFrom = doubleDamageFrom;
  }

  /**
   **/
  public TypeDetailDamageRelations noDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "no_damage_to")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  @JsonProperty(required = true, value = "no_damage_to")
  public void setNoDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeDetailDamageRelations addNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
    if (this.noDamageTo == null) {
      this.noDamageTo = new ArrayList<>();
    }

    this.noDamageTo.add(noDamageToItem);
    return this;
  }

  public TypeDetailDamageRelations removeNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
    if (noDamageToItem != null && this.noDamageTo != null) {
      this.noDamageTo.remove(noDamageToItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetailDamageRelations halfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "half_damage_to")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  @JsonProperty(required = true, value = "half_damage_to")
  public void setHalfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeDetailDamageRelations addHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
    if (this.halfDamageTo == null) {
      this.halfDamageTo = new ArrayList<>();
    }

    this.halfDamageTo.add(halfDamageToItem);
    return this;
  }

  public TypeDetailDamageRelations removeHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
    if (halfDamageToItem != null && this.halfDamageTo != null) {
      this.halfDamageTo.remove(halfDamageToItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetailDamageRelations doubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "double_damage_to")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  @JsonProperty(required = true, value = "double_damage_to")
  public void setDoubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeDetailDamageRelations addDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
    if (this.doubleDamageTo == null) {
      this.doubleDamageTo = new ArrayList<>();
    }

    this.doubleDamageTo.add(doubleDamageToItem);
    return this;
  }

  public TypeDetailDamageRelations removeDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
    if (doubleDamageToItem != null && this.doubleDamageTo != null) {
      this.doubleDamageTo.remove(doubleDamageToItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetailDamageRelations noDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "no_damage_from")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  @JsonProperty(required = true, value = "no_damage_from")
  public void setNoDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeDetailDamageRelations addNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
    if (this.noDamageFrom == null) {
      this.noDamageFrom = new ArrayList<>();
    }

    this.noDamageFrom.add(noDamageFromItem);
    return this;
  }

  public TypeDetailDamageRelations removeNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
    if (noDamageFromItem != null && this.noDamageFrom != null) {
      this.noDamageFrom.remove(noDamageFromItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetailDamageRelations halfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "half_damage_from")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  @JsonProperty(required = true, value = "half_damage_from")
  public void setHalfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeDetailDamageRelations addHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
    if (this.halfDamageFrom == null) {
      this.halfDamageFrom = new ArrayList<>();
    }

    this.halfDamageFrom.add(halfDamageFromItem);
    return this;
  }

  public TypeDetailDamageRelations removeHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
    if (halfDamageFromItem != null && this.halfDamageFrom != null) {
      this.halfDamageFrom.remove(halfDamageFromItem);
    }

    return this;
  }
  /**
   **/
  public TypeDetailDamageRelations doubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "double_damage_from")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageFrom() {
    return doubleDamageFrom;
  }

  @JsonProperty(required = true, value = "double_damage_from")
  public void setDoubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeDetailDamageRelations addDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
    if (this.doubleDamageFrom == null) {
      this.doubleDamageFrom = new ArrayList<>();
    }

    this.doubleDamageFrom.add(doubleDamageFromItem);
    return this;
  }

  public TypeDetailDamageRelations removeDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
    if (doubleDamageFromItem != null && this.doubleDamageFrom != null) {
      this.doubleDamageFrom.remove(doubleDamageFromItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

