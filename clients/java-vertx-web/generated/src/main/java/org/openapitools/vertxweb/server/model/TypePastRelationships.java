package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.TypeRelationships;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypePastRelationships   {
  
  private GenerationSummary generation;
  private TypeRelationships damageRelations;

  public TypePastRelationships () {

  }

  public TypePastRelationships (GenerationSummary generation, TypeRelationships damageRelations) {
    this.generation = generation;
    this.damageRelations = damageRelations;
  }

    
  @JsonProperty("generation")
  public GenerationSummary getGeneration() {
    return generation;
  }
  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

    
  @JsonProperty("damage_relations")
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
    return Objects.equals(generation, typePastRelationships.generation) &&
        Objects.equals(damageRelations, typePastRelationships.damageRelations);
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
