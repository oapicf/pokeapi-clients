package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.TypeDetailPastDamageRelationsInnerDamageRelations;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypeDetailPastDamageRelationsInner  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private AbilityDetailPokemonInnerPokemon generation;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;
 /**
   * Get generation
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }

  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  public TypeDetailPastDamageRelationsInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

 /**
   * Get damageRelations
   * @return damageRelations
  **/
  @JsonProperty("damage_relations")
  @NotNull
  public TypeDetailPastDamageRelationsInnerDamageRelations getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypeDetailPastDamageRelationsInner damageRelations(TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.damageRelations = damageRelations;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

