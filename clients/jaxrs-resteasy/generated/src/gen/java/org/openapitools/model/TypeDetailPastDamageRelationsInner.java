package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.TypeDetailPastDamageRelationsInnerDamageRelations;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-02-07T04:17:47.675703185Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TypeDetailPastDamageRelationsInner   {
  
  private AbilityDetailPokemonInnerPokemon generation;
  private TypeDetailPastDamageRelationsInnerDamageRelations damageRelations;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("generation")
  @NotNull
  @Valid
  public AbilityDetailPokemonInnerPokemon getGeneration() {
    return generation;
  }
  public void setGeneration(AbilityDetailPokemonInnerPokemon generation) {
    this.generation = generation;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("damage_relations")
  @NotNull
  @Valid
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

