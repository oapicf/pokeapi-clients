package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GenerationSummary;
import com.prokarma.pkmst.model.TypeRelationships;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TypePastRelationships
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class TypePastRelationships   {
  @JsonProperty("generation")
  private GenerationSummary generation;

  @JsonProperty("damage_relations")
  private TypeRelationships damageRelations;

  public TypePastRelationships generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

  /**
   * The last generation in which the referenced type had the listed damage relations
   * @return generation
   */
  @ApiModelProperty(required = true, value = "The last generation in which the referenced type had the listed damage relations")
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public TypePastRelationships damageRelations(TypeRelationships damageRelations) {
    this.damageRelations = damageRelations;
    return this;
  }

  /**
   * The damage relations the referenced type had up to and including the listed generation
   * @return damageRelations
   */
  @ApiModelProperty(required = true, value = "The damage relations the referenced type had up to and including the listed generation")
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

