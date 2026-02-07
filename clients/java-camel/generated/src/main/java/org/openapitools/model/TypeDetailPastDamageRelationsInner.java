package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.TypeDetailPastDamageRelationsInnerDamageRelations;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TypeDetailPastDamageRelationsInner
 */

@JsonTypeName("TypeDetail_past_damage_relations_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-02-07T04:17:25.266083787Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPastDamageRelationsInner {

  private AbilityDetailPokemonInnerPokemon generation;

  private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

  public TypeDetailPastDamageRelationsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TypeDetailPastDamageRelationsInner(AbilityDetailPokemonInnerPokemon generation, TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.generation = generation;
    this.damageRelations = damageRelations;
  }

  public TypeDetailPastDamageRelationsInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Get generation
   * @return generation
   */
  @NotNull @Valid 
  @Schema(name = "generation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generation")
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }

  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  public TypeDetailPastDamageRelationsInner damageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  /**
   * Get damageRelations
   * @return damageRelations
   */
  @NotNull @Valid 
  @Schema(name = "damage_relations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("damage_relations")
  public TypeDetailPastDamageRelationsInnerDamageRelations getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDetailPastDamageRelationsInner typeDetailPastDamageRelationsInner = (TypeDetailPastDamageRelationsInner) o;
    return Objects.equals(this.generation, typeDetailPastDamageRelationsInner.generation) &&
        Objects.equals(this.damageRelations, typeDetailPastDamageRelationsInner.damageRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, damageRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDetailPastDamageRelationsInner {\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
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

