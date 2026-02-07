package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.TypeDetailPastDamageRelationsInnerDamageRelations;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDetailPastDamageRelationsInner   {
  
  private AbilityDetailPokemonInnerPokemon generation;
  private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

  public TypeDetailPastDamageRelationsInner () {

  }

  public TypeDetailPastDamageRelationsInner (AbilityDetailPokemonInnerPokemon generation, TypeDetailPastDamageRelationsInnerDamageRelations damageRelations) {
    this.generation = generation;
    this.damageRelations = damageRelations;
  }

    
  @JsonProperty("generation")
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }
  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

    
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
    return Objects.equals(generation, typeDetailPastDamageRelationsInner.generation) &&
        Objects.equals(damageRelations, typeDetailPastDamageRelationsInner.damageRelations);
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
