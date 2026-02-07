package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TypeDetailPastDamageRelationsInnerDamageRelations
 */

@JsonTypeName("TypeDetail_past_damage_relations_inner_damage_relations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPastDamageRelationsInnerDamageRelations {

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom = new ArrayList<>();

  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom = new ArrayList<>();

  public TypeDetailPastDamageRelationsInnerDamageRelations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeDetailPastDamageRelationsInnerDamageRelations(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo, List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo, List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo, List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom, List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom, List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.noDamageTo = noDamageTo;
    this.halfDamageTo = halfDamageTo;
    this.doubleDamageTo = doubleDamageTo;
    this.noDamageFrom = noDamageFrom;
    this.halfDamageFrom = halfDamageFrom;
    this.doubleDamageFrom = doubleDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addNoDamageToItem(AbilityDetailPokemonInnerPokemon noDamageToItem) {
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
  @NotNull @Valid 
  @Schema(name = "no_damage_to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("no_damage_to")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageTo() {
    return noDamageTo;
  }

  public void setNoDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageTo) {
    this.noDamageTo = noDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addHalfDamageToItem(AbilityDetailPokemonInnerPokemon halfDamageToItem) {
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
  @NotNull @Valid 
  @Schema(name = "half_damage_to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("half_damage_to")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageTo() {
    return halfDamageTo;
  }

  public void setHalfDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageTo) {
    this.halfDamageTo = halfDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addDoubleDamageToItem(AbilityDetailPokemonInnerPokemon doubleDamageToItem) {
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
  @NotNull @Valid 
  @Schema(name = "double_damage_to", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("double_damage_to")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getDoubleDamageTo() {
    return doubleDamageTo;
  }

  public void setDoubleDamageTo(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageTo) {
    this.doubleDamageTo = doubleDamageTo;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations noDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addNoDamageFromItem(AbilityDetailPokemonInnerPokemon noDamageFromItem) {
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
  @NotNull @Valid 
  @Schema(name = "no_damage_from", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("no_damage_from")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getNoDamageFrom() {
    return noDamageFrom;
  }

  public void setNoDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> noDamageFrom) {
    this.noDamageFrom = noDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations halfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addHalfDamageFromItem(AbilityDetailPokemonInnerPokemon halfDamageFromItem) {
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
  @NotNull @Valid 
  @Schema(name = "half_damage_from", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("half_damage_from")
  public List<@Valid AbilityDetailPokemonInnerPokemon> getHalfDamageFrom() {
    return halfDamageFrom;
  }

  public void setHalfDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> halfDamageFrom) {
    this.halfDamageFrom = halfDamageFrom;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations doubleDamageFrom(List<@Valid AbilityDetailPokemonInnerPokemon> doubleDamageFrom) {
    this.doubleDamageFrom = doubleDamageFrom;
    return this;
  }

  public TypeDetailPastDamageRelationsInnerDamageRelations addDoubleDamageFromItem(AbilityDetailPokemonInnerPokemon doubleDamageFromItem) {
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
  @NotNull @Valid 
  @Schema(name = "double_damage_from", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("double_damage_from")
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

