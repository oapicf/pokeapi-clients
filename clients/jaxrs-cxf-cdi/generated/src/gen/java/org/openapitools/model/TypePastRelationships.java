package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.TypeRelationships;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class TypePastRelationships   {
  
  private GenerationSummary generation;

  private TypeRelationships damageRelations;

  /**
   * The last generation in which the referenced type had the listed damage relations
   **/
  public TypePastRelationships generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The last generation in which the referenced type had the listed damage relations")
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }


  /**
   * The damage relations the referenced type had up to and including the listed generation
   **/
  public TypePastRelationships damageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The damage relations the referenced type had up to and including the listed generation")
  @JsonProperty("damage_relations")
  @NotNull
  public TypeRelationships getDamageRelations() {
    return damageRelations;
  }
  public void setDamageRelations(TypeRelationships damageRelations) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

