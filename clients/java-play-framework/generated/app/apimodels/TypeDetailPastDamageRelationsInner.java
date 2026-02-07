package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.TypeDetailPastDamageRelationsInnerDamageRelations;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TypeDetailPastDamageRelationsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TypeDetailPastDamageRelationsInner   {
  @JsonProperty("generation")
  @NotNull
@Valid

  private AbilityDetailPokemonInnerPokemon generation;

  @JsonProperty("damage_relations")
  @NotNull
@Valid

  private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

  public TypeDetailPastDamageRelationsInner generation(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Get generation
   * @return generation
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

