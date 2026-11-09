package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.TypeRelationships;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TypePastRelationships  {
  
 /**
  * The last generation in which the referenced type had the listed damage relations
  */
  @ApiModelProperty(required = true, value = "The last generation in which the referenced type had the listed damage relations")

  @Valid

  private GenerationSummary generation;

 /**
  * The damage relations the referenced type had up to and including the listed generation
  */
  @ApiModelProperty(required = true, value = "The damage relations the referenced type had up to and including the listed generation")

  @Valid

  private TypeRelationships damageRelations;
 /**
   * The last generation in which the referenced type had the listed damage relations
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypePastRelationships generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * The damage relations the referenced type had up to and including the listed generation
   * @return damageRelations
  **/
  @JsonProperty("damage_relations")
  @NotNull
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }

  public void setDamageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
  }

  public TypePastRelationships damageRelations(TypeRelationships damageRelations) {
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
    TypePastRelationships typePastRelationships = (TypePastRelationships) o;
    return Objects.equals(this.generation, typePastRelationships.generation) &&
        Objects.equals(this.damageRelations, typePastRelationships.damageRelations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generation, damageRelations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypePastRelationships {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

